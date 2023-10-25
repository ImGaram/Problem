package level_1

fun solution(t: String, p: String): Int {
    var answer = 0
    for (j in p.length .. t.length) {
        val item = t.substring(j-p.length, j)

        if (item.toLong() <= p.toLong()) answer++
    }

    return answer
}