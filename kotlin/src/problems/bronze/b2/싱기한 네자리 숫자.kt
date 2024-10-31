package problems.bronze.b2

fun main() {
    for (n in 1000 .. 9999) {
        val base10 = n.toString().map { it.digitToInt(10) }
        val base12 = n.toString(12).map { it.digitToInt(12) }
        val base16 = n.toString(16).map { it.digitToInt(16) }

        if (base10.sum() == base12.sum() && base12.sum() == base16.sum()) println(n)
    }
}