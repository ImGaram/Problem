package problems.gold.g1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (start, end) = readLine().split(" ").map { it.toLong() }
    val range = (end - start + 1).toInt()
    val powNoNoNum = Array(range) { true }

    for (i in 2 .. 1000000) {
        val pow: Long = i * i.toLong()
        val startDiv = (start - 1) / pow + 1
        val endDiv = end / pow

        for (j in startDiv .. endDiv) {
            val changeIndex = (j * pow - start).toInt()

            if (changeIndex in powNoNoNum.indices) {
                powNoNoNum[changeIndex] = false
            }
        }
    }

    println(powNoNoNum.count { it })
}

/*val powNumber = pow

        while (pow <= end) {
            if (pow in start .. end) {
                val changeIndex = (pow - start).toInt()
                if (powNoNoNum[changeIndex]) powNoNoNum[changeIndex] = false
            }

            pow += powNumber
        }*/