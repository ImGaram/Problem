import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val mbti = bf.readLine()
    val num = bf.readLine().toInt()

    var sameCount = 0
    repeat(num) {
        val friendMbti = bf.readLine()

        if (mbti == friendMbti) sameCount+=1
    }

    bf.close()
    bw.write(sameCount.toString())
    bw.close()
}