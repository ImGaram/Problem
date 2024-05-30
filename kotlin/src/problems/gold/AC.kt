package src.problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    repeat(case) {
        val command = readLine()
        val arrLength = readLine().toInt()
        val inputArr = readLine()
        val arrStr = StringBuilder(inputArr.substring(1, inputArr.length-1))
        // string이 뒤집히는지 확인하기 위함.
        var isReserved = false
        var error = ""

        for (cmd in command) {
            when (cmd) {
                // true 배열이 뒤집힘.
                // false 배열이 원래 방향으로 돌아옴.
                'R' -> isReserved = !isReserved
                'D' -> {
                    if (arrStr.isEmpty()) {
                        error = "error"
                        break
                    } else {
                        if (isReserved) {
                            val comma = arrStr.lastIndexOf(",")

                            if (comma != -1) arrStr.delete(comma, arrStr.length)
                            else arrStr.deleteRange(0, arrStr.length)
                        } else {
                            val comma = arrStr.indexOf(",")

                            if (comma != -1) arrStr.delete(0, comma + 1)
                            else arrStr.deleteRange(0, arrStr.length)
                        }
                    }
                }
            }
        }

        val resultList = arrStr.split(",")
        if (error.isEmpty()) {
            if (isReserved) println("[${resultList.reversed().joinToString(",")}]")
            else println("[${resultList.joinToString(",")}]")
        }
        else println(error)
    }
}