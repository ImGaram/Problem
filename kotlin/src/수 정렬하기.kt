fun main() {
    val numCnt = readln().toInt()

    val array = ArrayList<Int>(numCnt)
    for (i in 0 until numCnt) {
        array.add(i, readln().toInt())
    }

    array.sort()
    for (i in array.indices) println(array[i])
}