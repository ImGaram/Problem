package level_2

class `의상` {
    // 옷 경우 찾는 방법
    // map과 개수마다 특정 개수씩 늘어나는 규칙을 이용해 찾을 거임.
    // 옷의 종류가 1가지인 경우(의상 A가 a개) => a번(a+1)-1
    // 옷의 종류가 2가지인 경우(의상 A가 a개, 의상 B가 b개)
    // => 의상 a, b를 한 개씩 입는 경우(a, b), 의상 a와 b를 혼합해 입는 경우(a * b) ==> 총 a + b + ab = (a+1)(b+1)-1
    // 옷의 종류가 3가지인 경우(의상 a, b, c)
    // => 총 a + b + c + ab + bc + ca + abc - 1 = (a+1)(b+1)(c+1)-1
    // 참고한 글: https://aram-su.tistory.com/22

    fun solution(clothes: Array<Array<String>>): Int {
        val clothesMap = mutableMapOf<String, Int>()     // 옷의 종류를 알 수 있는 map(key: 옷의 종류, value: 해당 종류의 옷의 개수
        var answer = 1

        clothes.forEach {
            val kindCloth = it[1]
            if (clothesMap.containsKey(kindCloth)) {
                clothesMap[kindCloth] = clothesMap[kindCloth]!! + 1
            } else {
                clothesMap[it[1]] = 1
            }
        }

        clothesMap.forEach {
            answer *= (it.value + 1)
        }

        return answer - 1
    }
}

fun main() {
    `의상`().solution(arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear")))
}