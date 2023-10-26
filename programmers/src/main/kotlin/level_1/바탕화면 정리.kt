package level_1

class `바탕화면 정리` {
    // 드래그 거리 계산하기
    // #을 찾기 => 변수 4개의 값을 넣기
    // 넣는 기준: dragStart => 가장 작은 값, dragEnd => 가장 큰 값으로
    // 출력 형식: [dragStartY, dragStartX, dragEndY, dragEndX]

    fun solution(wallpaper: Array<String>): IntArray {
        var dragStartX = 51
        var dragStartY = 51

        var dragEndX = 0
        var dragEndY = 0

        for (y in wallpaper.indices) {
            for (x in wallpaper[y].indices) {
                if (wallpaper[y][x] == '#') {
                    if (dragStartX > x) dragStartX = x
                    if (dragStartY > y) dragStartY = y

                    // dragEnd 는 배열을 기준으로 #을 완전히 덮어야 하기 때문에 +1 씩 해주어야 함(조건에도 -1씩)
                    if (dragEndX - 1 < x) dragEndX = x + 1
                    if (dragEndY - 1 < y) dragEndY = y + 1
                }
            }
        }

        return intArrayOf(dragStartY, dragStartX, dragEndY, dragEndX)
    }
}

fun main() {
    `바탕화면 정리`().solution(arrayOf("..........", ".....#....", "......##..", "...##.....", "....#....."))
}