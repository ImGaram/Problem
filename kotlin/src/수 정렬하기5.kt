import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val numArray = IntArray(num)
    repeat(num) { numArray[it] = br.readLine().toInt() }
    br.close()

    numArray.sort()
    repeat(numArray.size) { i ->
        bw.write("${numArray[i]}\n")
    }

    bw.close()
}