package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    data class Person(
        val age: Int = 0,
        val name: String = ""
    )

    val case = nextInt()
    val personList = mutableListOf<Person>()

    for (i in 0 until case) {
        val age = nextInt()
        val name = next()

        personList.add(Person(age, name))
    }

    personList.sortedBy { it.age }.forEach { person ->
        println("${person.age} ${person.name}")
    }
}