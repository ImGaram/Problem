package main.kotlin.level_1

class `체육복` {
    // 학생 n명 중 체육복을 잃어버린 lost 데이터가 있을 때, 빌려줄 수 있는 학생인 reserve를 통해 가장 많이 체육복을 입을 수 있는 경우를 구해 return.
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        // null: 체육복은 가지고 있지만 누구를 빌려줄 수 없음
        // true: 다른 사람한테 체육복을 빌려줄 수 있음.
        // false: 체육복이 없음.
        val own = MutableList<Boolean?>(n) { null }
        lost.forEach {
            own[it-1] = false
        }
        reserve.forEach {
            own[it-1] = true
        }

        // lost와 reserve의 중복되는 숫자를 찾아냄(교집합) => 데이터가 존재한다는 것은 여벌 체육복이 있는 사람이 여별을 도난당해 자신이 입을 것 밖에 없다는 뜻.
        val equal = lost.toSet().intersect(reserve.toSet())
        for (i in equal) {
            own[i-1] = null
        }

        // 체육복을 넘겨주기.
        for (i in 0 until own.size) {
            // 다른 사람에게 체육복을 빌려줄 수 없는 상태이거나(null), 체육복이 없는 경우(false) continue.
            // i가 0인 경우에는 i+1만, i가 마지막일 때는 i-1만 봐야 함.
            if (own[i] != true) continue
            if (i-1 >= 0 && own[i-1] == false) {
                own[i - 1] = null
                continue
            }
            if (i+1 <= own.size-1 && own[i+1] == false) {
                own[i + 1] = null
                continue
            }
        }

        // 체육복을 소지하지 못한 학생들은 제외하고 size를 구함.
        answer = own.filter { it != false }.size
        return answer
    }
}

fun main() {
    println(`체육복`().solution(3, intArrayOf(3), intArrayOf(1, 3)))
}