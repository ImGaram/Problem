import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val numCnt = bf.readLine().toInt()
    val st = StringTokenizer(bf.readLine())

    val arr = IntArray(numCnt)
    repeat(numCnt) {
        // 3 5 2 7
        arr[it]=st.nextToken().toInt()
    }

    // 3 -> 5 바로 구해짐
    // 5 -> 2 바로 안구해짐 스택에 넣기
    // 2 -> 7 구해짐, 5의 오큰수도 구할 수 있음

    val stack = Stack<Int>()    // 오큰수 스택
    val indexStack = Stack<Int>()   // 인덱스 스택
    val res = IntArray(numCnt) { -1 }   // result 배열
    for (i in arr.indices) {   // 1 2 3
        while (stack.isNotEmpty() && stack.peek() < arr[i]) {   // 스택이 채워져 있음, 스택의 가장 위의 값이 arr[i]보다 작음
            // 오큰수를 구함
            res[indexStack.pop()] = arr[i]
            stack.pop()
        }

        stack.add(arr[i])
        indexStack.add(i)
    }

    for (i in res.indices) bw.write("${res[i]} ")

    stack.clear()
    indexStack.clear()

    bw.flush()
    bw.close()
    bf.close()
}