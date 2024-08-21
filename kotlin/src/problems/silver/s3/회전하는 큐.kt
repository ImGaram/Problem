package problems.silver.s3

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (num, case) = readln().split(" ").map { it.toInt() }    // 큐의 크기, 케이스의 개수

    val arrayDeque = ArrayDeque<Int>(num)
    repeat(num) { arrayDeque.addLast(it+1) }

    val st = StringTokenizer(readln())
    val searchList = IntArray(case) // 테스크 케이스를 넣을 리스트
    repeat(case) { searchList[it] = st.nextToken().toInt() }

    var cnt = 0
    for (i in 0 until case) {   // 케이스 만큼 반복
        val target = arrayDeque.indexOf(searchList[i])  // 찾으려는 수의 인덱스
        val mid = if (arrayDeque.size % 2 == 0) arrayDeque.size/2-1 // 중앙의 인덱스 구하기
        else arrayDeque.size/2

        if (target <= mid) {  // 중앙보다 앞에 있을때
            for (j in 0 until target) {
                arrayDeque.addLast(arrayDeque.removeFirst())    // 큐의 뒤에 큐의 맨 앞 삽입
                cnt++
            }
        } else {    // 중앙보다 뒤에 있을때
            for (j in 0 until arrayDeque.size - target) {
                arrayDeque.addFirst(arrayDeque.removeLast())    // 큐의 앞에 큐의 맨 뒤 삽입
                cnt++
            }
        }
        arrayDeque.removeFirst()    // 맨 앞 원소 제거
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
}