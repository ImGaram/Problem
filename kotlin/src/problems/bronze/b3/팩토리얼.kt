fun main() {
    val sc = readlnOrNull()!!.toInt()
    var res = 1

    if (sc == 0) print(1)
    else {
        for (i in 1..sc) {
            res *= i
        }

        print(res)
    }
}
