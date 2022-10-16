import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val arrIndex = bf.readLine().toInt()
    val st = StringTokenizer(bf.readLine())

    val array = arrayListOf<Int>()
    repeat(arrIndex) {
        if (st.hasMoreTokens())
            array.add(st.nextToken().toInt())
    }

    var big = 0
    var bigIndex = 0
    val distinctArray = array.distinct()
    for (i in distinctArray.indices) {
        if (array[i] > big) {
            big = array[i]
            bigIndex = i
        }
    }
    //7
    //5 4 3 2 30 20 1

    //5
    //7 5 3 1 10

    //6
    //10 30 10 20 20 10

    val tempArr = arrayListOf<Int>()
    for (i in bigIndex until array.size) {
        tempArr.add(array[i])
    }

    println(tempArr.sortedDescending().distinct().size)

    /*var bigCnt = 1
    var data = 0
    for (i in bigIndex until tempArr.distinct().size) {
        if (array[i] < array[bigIndex]) {
            if (data == array[i]) continue
            bigCnt += 1
            data = array[i]
        }
    }

    println(bigCnt)*/
}