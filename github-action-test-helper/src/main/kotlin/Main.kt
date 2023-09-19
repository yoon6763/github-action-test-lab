import java.io.File
import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    val defaultPath = File(".").absoluteFile.parentFile.parentFile.absolutePath

    val readMe = File("$defaultPath/README.md")

    val content = StringBuilder()
    content.appendLine(readMe.readText())

    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    val now = Calendar.getInstance().time

    content.appendLine("updated at ${simpleDateFormat.format(now)} - GitHub Actions")

    readMe.writeText(content.toString())
}