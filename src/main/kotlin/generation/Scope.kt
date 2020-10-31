package generation

interface Scope {
    // Navigating scopes
	val hasParent: Boolean
    var parent: Scope?

    val variables: MutableList<Variable>
    val variablesCount: Int

    // Querying variables
    fun hasVariable(name: String): Boolean
    fun hasVariableInOuterScopes(name: String): Boolean
    fun getVariable(name: String): Variable
    fun addVariable(name: String): Int
    fun addVariableRef(name: String): Int
}
