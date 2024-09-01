import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    val num = bf.readLine().toInt()
    val voteArray = IntArray(num)
    repeat(num) {
        voteArray[it] = bf.readLine().toInt()
    }

    var buyingCnt = 0

    if (voteArray.size == 1 && voteArray[0]==1) {
        println(0)
        return
    } else {
        while (voteArray[0] <= voteArray[getBigIndex(voteArray)] && getBigIndex(voteArray) != 0) {
            voteArray[getBigIndex(voteArray)]-=1
            voteArray[0]+=1
            buyingCnt+=1
        }

        println(buyingCnt)
    }
}

fun getBigIndex(voteArray: IntArray): Int {
    var big = 0
    var bigIndex = 0
    for (i in 1 until voteArray.size) {
        if (voteArray[i] > big) {
            big = voteArray[i]
            bigIndex = i
        }
    }

    return bigIndex
}