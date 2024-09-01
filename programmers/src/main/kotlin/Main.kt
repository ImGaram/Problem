fun main(args: Array<String>) {
    println(solution("2022.05.19", arrayOf("A 6", "B 12", "C 3"), arrayOf("2021.05.02 A",
        "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")))
}

fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
    var answer: IntArray = intArrayOf()
    val termMap = HashMap<String, Int>()

    for (i in terms) {
        termMap[i.split(" ")[0]] = i.split(" ")[1].toInt() * 28
    }
    println(termMap)

    for (term in privacies) {
        val registerDate = term.split(" ")[0]   // 등록일

        var tempYear = registerDate.split(".")[0].toInt()
        var tempMonth = registerDate.split(".")[1].toInt()

        val registerDay = registerDate.split(".")[2]    // 등록일 day
        // 만료기간 변수
        var infoTerm = registerDay.toInt() + termMap[term.split(" ")[1]]!!

        while (infoTerm > 28) {
            infoTerm -= 28
            tempMonth++
//            println("$infoTerm, $registerDate")

            if (tempMonth > 12) {
                tempMonth -= 12
                tempYear++
            }
        }

        println("$tempYear, $tempMonth, $infoTerm")
    }

    // 만료기간 = 수집일(등록일) + 약관 달

    return answer
}