package level_1

import java.text.SimpleDateFormat

fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer = mutableListOf<Int>()
    val termMap = HashMap<String, Int>()

    val todayDate = SimpleDateFormat("yyyy.MM.dd").parse(today)
    println(todayDate)

    for (i in terms) {
        termMap[i.split(" ")[0]] = i.split(" ")[1].toInt()
    }
    println(termMap)

    for (term in privacies.indices) {
        val registerDate = privacies[term].split(" ")[0]   // 등록일

        var tempYear = registerDate.split(".")[0].toInt()
        val tempMonth = registerDate.split(".")[1].toInt()
        var tempDay = registerDate.split(".")[2].toInt()

        var infoTerm = tempMonth + termMap[privacies[term].split(" ")[1]]!!

        tempDay--
        while (infoTerm > 12) {
            infoTerm -= 12
            tempYear++

            if (tempDay <= 0) {
                tempDay = 28
                infoTerm--
            }
        }

        val expirationDate = SimpleDateFormat("yyyy.MM.dd").parse("$tempYear.$infoTerm.$tempDay")
        println(expirationDate)

        val res = todayDate.compareTo(expirationDate)
        println(res)
        when (res) {
            1 -> answer.add(term+1)
            else -> continue
        }
    }

    return answer.toIntArray()
}