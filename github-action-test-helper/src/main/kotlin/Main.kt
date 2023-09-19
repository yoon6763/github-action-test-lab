import java.io.File
import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    val defaultPath = System.getProperty("user.dir")
    val rootPath = File(defaultPath).parentFile

    val readMe = File("/home/runner/work/github-action-test-lab/github-action-test-lab/README.md")

    val content = StringBuilder()
    content.appendLine(readMe.readText())

    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

    val now = Calendar.getInstance().time

    content.appendLine("updated at ${simpleDateFormat.format(now)} - GitHub Actions")

    readMe.writeText(content.toString())
}