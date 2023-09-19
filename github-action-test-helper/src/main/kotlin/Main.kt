import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

fun main(args: Array<String>) {
    val defaultPath = File(".").absoluteFile.parentFile

    println(defaultPath)

    val randomFileName = "text_${System.currentTimeMillis()}.txt"

    val randomTextFile = File(defaultPath, randomFileName)

    val randomTextFileBufferedWriter = BufferedWriter(FileWriter(randomTextFile))
    randomTextFileBufferedWriter.write("Hello World")
    randomTextFileBufferedWriter.write("테스트 파일")
    randomTextFileBufferedWriter.newLine()

    randomTextFileBufferedWriter.close()


//    val textFile = File(defaultPath, "text.txt")
//
//
//    val textFileBufferedReader = textFile.bufferedReader()
//    var version = textFileBufferedReader.readLine().toInt()
//    version++
//
//
//    val textFileBufferedWriter = BufferedWriter(FileWriter(textFile))
//    textFileBufferedWriter.write(version.toString())
//    textFileBufferedWriter.newLine()
//
//
//    textFileBufferedWriter.write("Hello World")
//    textFileBufferedWriter.newLine()
//
//    textFileBufferedWriter.write("테스트 파일")
//    textFileBufferedWriter.newLine()
//
//    textFileBufferedWriter.close()
}