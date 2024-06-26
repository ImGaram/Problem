package problems.bronze

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val treeAge = nextInt()
        if (treeAge == 0) break

        var branch = 1
        for (i in 0 until treeAge) {
            val grow = nextInt()
            val cutting = nextInt()

            branch *= grow
            branch -= cutting
        }

        println(branch)
    }
}