package generation.impl

import generation.Scope
import generation.Variable
import generation.exceptions.scope.VariableAlreadyInScope
import generation.exceptions.scope.VariableNotInScope

abstract class AbstractScope: Scope {
    override var parent: Scope? = null

    override val hasParent
        get() = parent != null

    override val variables = mutableListOf<Variable>()

    override val variablesCount: Int
        get() = variables.size

    override fun hasVariable(name: String) =
        variables.find { it.name == name } != null

    override fun hasVariableInOuterScopes(name: String) =
        hasParent && (parent!!.hasVariable(name)
                || parent!!.hasVariableInOuterScopes(name))

    override fun getVariable(name: String): Variable =
        when {
            hasVariable(name) -> variables.find { it.name == name }!!
            hasParent         -> parent!!.getVariable(name)
            else              -> throw VariableNotInScope(name)
        }

    override fun addVariable(name: String): Int {
        // References are overwritten by actual variables declarations
        if (hasVariable(name) && !getVariable(name).isRef) {
            throw VariableAlreadyInScope(name)
        }
        val variableIndex = variables.size
        variables.add(Variable(name, false, variableIndex, this))
        return variableIndex
    }

    override fun addVariableRef(name: String): Int {
        if (hasVariable(name)) {
            throw VariableAlreadyInScope(name)
        }
        val variableIndex = variables.size
        variables.add(Variable(name, true, variableIndex, this))
        return variableIndex
    }
}
