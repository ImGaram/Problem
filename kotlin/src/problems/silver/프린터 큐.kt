package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 첫 줄에 테스트케이스의 수가 주어진다. 각 테스트케이스는 두 줄로 이루어져 있다.
    //
    // 테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다. 이때 맨 왼쪽은 0번째라고 하자. 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다. 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.
    //
    // 테스트 케이스의 개수.
    // N(문서의 개수) M(원하는 문서가 있는 index)
    // 문서들 목록.

    // 1 1 9 1 1 1
    val case = readLine().toInt()
    for (i in 0 until case) {
        val (docCnt, index) = readLine().split(" ").map { it.toInt() }
        val queue: Queue<String> = LinkedList()
        val docData = StringTokenizer(readLine())

        for (j in 0 until docCnt) {
            if (docData.hasMoreTokens()) {
                if (j == index) queue.add(docData.nextToken()+"*")
                else queue.add(docData.nextToken())
            }
        }

        var print = 0
        while (queue.isNotEmpty()) {
            if (queue.peek() == queue.max()[0].toString()) {
                queue.poll()
                print++
            } else {
                if (queue.peek() == queue.max() && queue.peek().contains("*")) {
                    queue.poll()
                    print++
                    break
                } else {
                    val moveBackValue = queue.poll()
                    queue.add(moveBackValue)
                }
            }
        }

        println(print)
    }
}