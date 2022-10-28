import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = bf.readLine().toInt()
    val stringArray = ArrayList<String>(num)
    repeat(num) {
        val data = bf.readLine()
        stringArray.add(it, data)
    }

    val comparator: Comparator<String> = compareBy { it.length }
    val resultArray = stringArray.sortedWith(comparator).toMutableList()
    for (i in 0..resultArray.size+1) {
        if (resultArray[i].length == resultArray[i+1].length) {
            if (resultArray[i] > resultArray[i+1])
                resultArray[i] = resultArray[i+1].also { resultArray[i+1] = resultArray[i] }
            else if (resultArray[i] < resultArray[i+1])
                resultArray[i+1] = resultArray[i].also { resultArray[i] = resultArray[i+1] }
            else continue
        }
    }


    bf.close()
    bw.write(stringArray.sortedWith(comparator).distinct().toString())
    bw.close()
}