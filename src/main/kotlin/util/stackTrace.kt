package util

import java.io.PrintWriter
import java.io.StringWriter

fun Exception.stackTraceString(): String {
    val stringWriter = StringWriter()
    val printWriter = PrintWriter(stringWriter)
    printStackTrace(printWriter)
    return stringWriter.toString()
}
