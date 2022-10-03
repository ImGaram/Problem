fun main() {
    val number = readln().toInt()

    var firstNum = 0
    var secNum = 1
    var fibonacci = 0

    if (number == 1) println(secNum)
    else {
        for (i in 2..number) {
            fibonacci = firstNum + secNum
            firstNum = secNum
            secNum = fibonacci
        }

        println(fibonacci)
    }
}