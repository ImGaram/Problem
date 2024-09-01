package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var southAfricaVisited = false
    var zambiaVisited = false
    var zimbabweVisited = false
    var expense = 0
    for (i in 0 until case) {
        val country = readLine()
        when (country) {
            "botswana" -> {
                expense += 0
            }
            "ethiopia" -> {
                expense += 50
            }
            "kenya" -> {
                expense +=  50
            }
            "namibia" -> {
                // 140
                // south-africa 방문 후 방문 시 40
                expense += if (southAfricaVisited) 40 else 140
            }
            "south-africa" -> {
                southAfricaVisited = true
                expense += 0
            }
            "tanzania" -> {
                expense += 50
            }
            "zambia" -> {
                if (zimbabweVisited) expense += 20
                else {
                    zambiaVisited = true
                    expense += 50
                }
                // zambia 또는 zimbabwe 를 연속해서 방문한다면 둘이 합쳐서 50
            }
            "zimbabwe" -> {
                if (zambiaVisited) expense += 0
                else {
                    zimbabweVisited = true
                    expense += 30
                }
                // zambia 또는 zimbabwe 를 연속해서 방문한다면 둘이 합쳐서 50
            }
        }

        if (country != "zambia" && country != "zimbabwe") {
            zambiaVisited = false
            zimbabweVisited = false
        }
    }

    println(expense)
}