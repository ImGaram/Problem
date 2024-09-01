package level_1

class `공원 산책` {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val mapArray = Array(park.size) { Array(park[0].length) { 'e' } }
        var dog: Array<Int> = emptyArray()

        // map 초기화
        for (y in park.indices) {
            for (x in park[y].indices) {
                if (park[y][x] == 'S') dog = arrayOf(y, x)
                mapArray[y][x] = park[y][x]
            }
        }

        println("before dog: ${dog.toList()}")
        routes.forEach { route ->
            val routeDirection = route.split(" ").first()
            val routeMovement = route.split(" ").last().toInt()

            // dog의 값을 통해 map의 데이터가 X인지 확인하기
            val dogX = dog[1]
            val dogY = dog[0]
            var isNo = false
            when (routeDirection) {
                "E" -> {
                    // 이동 결과가 맵을 넘어갈 경우
                    if (dogX + routeMovement < mapArray[0].size) {
                        for (move in 1 .. routeMovement) {
                            val result = mapArray[dogY][dogX + move]
                            if (result == 'X') isNo = true
                        }

                        if (!isNo) dog[1] += routeMovement
                    }

                    println("after east: ${dog.toList()}")
                }
                "W" -> {
                    if (dogX - routeMovement >= 0) {
                        for (move in 1 ..  routeMovement) {
                            val result = mapArray[dogY][dogX - move]
                            if (result == 'X') isNo = true
                        }

                        if (!isNo) dog[1] -= routeMovement
                    }
                    println("after west: ${dog.toList()}")
                }
                "S" -> {
                    if (dogY + routeMovement < mapArray.size) {
                        for (move in 1 .. routeMovement) {
                            val result = mapArray[dogY + move][dogX]
                            if (result == 'X') isNo = true
                        }

                        if (!isNo) dog[0] += routeMovement
                    }
                    println("after south: ${dog.toList()}")
                }
                "N" -> {
                    if (dogY - routeMovement >= 0) {
                        for (move in 1 ..  routeMovement) {
                            val result = mapArray[dogY - move][dogX]
                            if (result == 'X') isNo = true
                        }

                        if (!isNo) dog[0] -= routeMovement
                    }
                    println("after north: ${dog.toList()}")
                }
            }
        }

        println(dog.toList())
        return dog.toIntArray()
    }
}

fun main() {
    `공원 산책`().solution(arrayOf("OSO","OOO","OXO","OOO"), arrayOf("E 2","S 3","W 1"))
}