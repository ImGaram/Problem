package src.problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val inputList = mutableListOf<String>()
    for (i in 0 until 3) {
        inputList.add(next())
    }

    var plusValue = 0
    var inputInt = 0
    for (i in 0 until inputList.size) {
        try {
            inputInt = inputList[i].toInt()
            plusValue = i
        } catch (e: Exception) {
            // error
        }
    }

    val checkValue = inputInt + (inputList.size - plusValue)
    if (checkValue % 3 == 0 && checkValue % 5 == 0) println("FizzBuzz")
    else if (checkValue % 3 == 0 && checkValue % 5 != 0) println("Fizz")
    else if (checkValue % 3 != 0 && checkValue % 5 == 0) println("Buzz")
    else println(checkValue)
}