package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val brackets = Stack<Char>()

    while (true) {
        var isCorrect = ""
        val input = readLine()
        if (input == ".") break

        // stack에 괄호 문자열을 넣기
        // 봐야 할 stack의 괄호가 닫는 괄호일 때, 바로 다음에 여는 괄호가 나와야 한다.
        for (i in input.indices) {
            if (input[i] == '[' || input[i] == '(') brackets.push(input[i])
            else if (input[i] == ']') {
                // 닫는 소괄호가 존재할 경우 스택이 비어있거나 다음 데이터가 여는 괄호여야 올바른 문자이다.
                if (brackets.isEmpty() || brackets.peek() != '[') isCorrect = "no"
                else brackets.pop()
            } else if (input[i] == ')') {
                if (brackets.isEmpty() || brackets.peek() != '(') isCorrect = "no"
                else brackets.pop()
            }
        }

        // for의 조건에서 걸러진 isCorrect를 stack이 비어있다고 해서 yes로 바꾸면 안되므로 isCorrect가 비어있지 않을 때만 yes로 변경;
        isCorrect = if (brackets.isEmpty() && isCorrect.isEmpty()) "yes" else "no"
        println(isCorrect)

        // 재시작 전 stack 초기화
        brackets.clear()
    }
}