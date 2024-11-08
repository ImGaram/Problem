package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val toppings = bf.readLine().split(" ")
    val usedTopping = mutableSetOf<String>()

    for (i in toppings.indices) {
        val topping = toppings[i]

        if (topping.length >= 6) {
            if (topping.substring(topping.length - 6, topping.length) == "Cheese") {
                usedTopping.add(topping)
            }
        }
    }

    if (usedTopping.size >= 4) println("yummy")
    else println("sad")
}