package main.kotlin.level_1

class `직사각형 별찍기` {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        repeat(b) {
            repeat(a) {
                print("*")
            }
            println()
        }
    }
}