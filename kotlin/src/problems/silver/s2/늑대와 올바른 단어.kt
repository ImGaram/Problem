package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private enum class State {
    S, W, O, L, F
}

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val str = bf.readLine()

    var answer = 1
    val cnt = Array(4) { 0 }
    var state = State.S

    var i = 0
    while (i < str.length) {
        when (state) {
            State.S -> {
                if (str[i] != 'w') {
                    answer = 0
                    break
                }

                state = State.W
                cnt[0]++
            }
            State.W -> {
                if (str[i] == 'w') cnt[0]++
                else if (str[i] == 'o') {
                    state = State.O
                    cnt[1]++
                } else {
                    answer = 0
                    break
                }
            }
            State.O -> {
                if (str[i] == 'o') cnt[1]++
                else if (str[i] == 'l') {
                    if (cnt[0] != cnt[1]) {
                        answer = 0
                        break
                    }

                    state = State.L
                    cnt[2]++
                } else {
                    answer = 0
                    break
                }
            }
            State.L -> {
                if (str[i] == 'l') cnt[2]++
                else if (str[i] == 'f') {
                    if (cnt[1] != cnt[2]) {
                        answer = 0
                        break
                    }

                    state = State.F
                    cnt[3]++
                } else {
                    answer = 0
                    break
                }
            }
            State.F -> {
                if (str[i] == 'f') cnt[3]++
                else if (str[i] == 'w') {
                    if (cnt[2] != cnt[3]) {
                        answer = 0
                        break
                    }

                    state = State.S
                    cnt.fill(0)
                    i--
                } else {
                    answer = 0
                    break
                }
            }
        }
        i++
    }

    if (cnt[0] != cnt[3]) answer = 0

    println(answer)
}