package array

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val set = mutableSetOf<Int>()   // 배열 선언, mutableSet 은 set 을 상속 받는다.
    repeat(10) {    // 10번 반복 (for 보가 편리함)
        set.add(readLine().toInt() % 42)    // set 에 42로 나눈 값 삽입
    }
    // Set 은 의미 그대로 집합처럼 중복되지 않는, 고유한 원소만을 갖는다
    println(set.size)   // 중복되지 않는 값 출력(mutableSet)
}
