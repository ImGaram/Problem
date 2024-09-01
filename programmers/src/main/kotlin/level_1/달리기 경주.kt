package level_1

class `달리기 경주` {
    // 현재 player list 순서대로 선수의 등수를 나타냄
    // callings에 언급된 선수는 등수가 1 증가람

    // target index 설정하기

    // 해당 index에서 한 칸 앞으로의 데이터와 위치를 바꾸기
    // 이미 맨 앞(1위)이면 제외
    // swap 방법 => 변경할 데이터 변수로 저장, 해당 인덱스의 데이터 삭제 후, 해당 인텍스의 한 칸 앞에 데이터 삽입
    // 1 2 3 4, 3 => 1 3 2 4

    // 배열을 이용하면 시간 초과가 발생함
    // map을 이용해서 풀기

    // players 를 map으로 => key: 이름, value: 등수
    // key: 등수, value: 이름 => 2개의 map
    // callings에 따라서 key가 이름인 map에서 등수를 뽑기

    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerNameMap = hashMapOf<String, Int>()
        val playerPlaceMap = hashMapOf<Int, String>()

        players.forEachIndexed { index, player ->
            playerNameMap[player] = index
            playerPlaceMap[index] = player
        }

        callings.forEach { call ->
            val place = playerNameMap[call]!!               // 추월 유저의 등수
            val changingData = playerPlaceMap[place]!!      // 추월 유저
            val changedData = playerPlaceMap[place-1]!!     // 바로 앞 유저

            playerNameMap[changingData] = place-1
            playerNameMap[changedData] = place

            playerPlaceMap[place] = changedData
            playerPlaceMap[place-1] = changingData
        }

        val answer = mutableListOf<String>()
        playerPlaceMap.forEach { key, value ->
            answer.add(key, value)
        }

        return answer.toTypedArray()
    }

//        fail code(배열 사용)
/*        val playerList = players.toMutableList()
        var targetIndex: Int

        callings.forEach { call ->
            targetIndex = playerNameMap[call]!!

            if (targetIndex != 0) {
                val tempData = playerList[targetIndex]
                playerList.removeAt(targetIndex)
                playerList.add(targetIndex - 1, tempData)
            }
        }*/
}