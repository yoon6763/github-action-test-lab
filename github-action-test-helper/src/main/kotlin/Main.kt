import java.io.File
import java.text.SimpleDateFormat
import java.util.Calendar

fun main() {
    val githubBasePath = "/home/runner/work/github-action-test-lab/github-action-test-lab"
    val readMe = File("$githubBasePath/README.md")

    val content = StringBuilder()

    content.appendLine(readMe.readText()) // 기존 내용을 그대로 가져옴


    val now = Calendar.getInstance().apply {
        add(Calendar.HOUR, 9) // UTC +9 (한국 시각으로 변경)
    }

    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss") // 날짜 포맷

    content.appendLine("updated at ${simpleDateFormat.format(now.timeInMillis)} - GitHub Actions") // 내용 추가

    readMe.writeText(content.toString()) // 파일에 내용을 씀
}