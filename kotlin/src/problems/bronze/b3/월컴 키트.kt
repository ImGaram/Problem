package src.problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 티셔츠는 s, m, l ,xl, xxl, xxxl 6종이 있음. 티셔츠는 같은 사이즈 T장 묶음으로만 주문 가능.
    // 펜은 1종류로, P자루씩 묶음으로 주문하거나 1자루씩 주문.
    // N명의 참가자들이 6종의 사이즈 중 하나를 선택했을 때, 티셔츠는 남아도 되지만 부족하면 안됨, 신청한 사이즈대로 줘야함.
    // 펜은 남거나 부족하면 안되고 정확이 N개 준비되어야 함.
    val participant = readLine().toInt()
    val clothes = readLine().split(" ").map { it.toInt() }
    val bundle = readLine().split(" ").map { it.toInt() }
    val clothesBundle = bundle.first()
    val penBundle = bundle.last()

    var resultClothesBundle = 0
    for (i in clothes.indices) {
        resultClothesBundle += if (clothes[i] % clothesBundle != 0) clothes[i] / clothesBundle + 1
        else clothes[i] / clothesBundle
    }

    println(resultClothesBundle)
    println("${participant / penBundle} ${participant % penBundle}")
}