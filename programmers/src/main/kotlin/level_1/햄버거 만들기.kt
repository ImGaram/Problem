package level_1

import java.util.*

class `햄버거 만들기` {
    // 데이터의 순서가 1 2 3 1 이면 햄버거 1개를 만들 수 있음
    // 햄버거의 상태를 저장할게 필요해 보임
    // 햄버거의 상태를 stack으로 int를 저장함
    // 임시로 stack의 최신 4개의 데이터를 받기 위한 list를 생성 후, list의 데이터라 1231이면 stack에서 데이터 빼기, answer++
    fun solution(ingredient: IntArray): Int {
        var answer = 0
        val stack = Stack<Int>()
        val list = mutableListOf<Int>()
        ingredient.forEach {
            // stack에 int를 넣음
            stack.push(it)
            if (stack.size >= 4) {
                for (data in stack.size - 4 until stack.size) {
                    list.add(stack[data])
                }

                if (list == listOf(1,2,3,1)) {
                    answer = answer + 1
                    list.clear()
                    repeat(4) { stack.pop() }
                }

                list.clear()
            }
        }

        return answer
    }
}

fun main() {
    `햄버거 만들기`().solution(intArrayOf(1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1))
}
