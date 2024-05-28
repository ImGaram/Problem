package main.kotlin.level_1

class `숫자 짝꿍` {
    fun solution(x: String, y: String): String {
        val answer = StringBuilder()
        val xArr = MutableList(10) { 0 }
        val yArr = MutableList(10) { 0 }

        // x, y에서 0 ~ 9까지의 숫자의 개수를 센 다음. x, y에 숫자가 존재하는 애들만 builder에 넣기..
        x.forEach {
            xArr[it.digitToInt()]++
        }
        y.forEach {
            yArr[it.digitToInt()]++
        }

        // 0 ~ 9 까지 10종류의 숫자만 있음.
        for (number in 9 downTo 0) {
            // x와 y가 0보다 크다는 것은 x와 y에 숫자가 존재한다는 뜻.
            val xNumberCnt = xArr[number]
            val yNumberCnt = yArr[number]
            if (xNumberCnt > 0 && yNumberCnt > 0) {
                if (xNumberCnt > yNumberCnt) {
                    repeat(yNumberCnt) { answer.append(number) }
                } else {
                    // x, y가 같거가 y가 큰 경우.
                    repeat(xNumberCnt) { answer.append(number) }
                }
            }
        }

        // answer가 비어 있으면 -1을 return.
        if (answer.isEmpty()) return "-1"
        // answer에서 0인 데이터들의 length와 answer의 length가 같을 때 => answer에 0밖에 없다는 뜻.
        if (answer.filter { it == '0' }.length == answer.length) return "0"
        return answer.toString()
    }
}

fun main() {
    println(`숫자 짝꿍`().solution("1000000002", "20200"))
}