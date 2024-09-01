package main.kotlin.level_3

import java.util.LinkedList

class `베스트앨범` {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val music = mutableMapOf<String, MutableMap<Int, Int>>()
        val musicPlay = mutableMapOf<String, Int>() // 총 재생 횟수

        for (i in genres.indices) {
            val genresType = genres[i]
            val play = plays[i]

            if (!music.containsKey(genresType)) {
                music[genresType] = mutableMapOf(i to play)
                musicPlay[genresType] = play
            } else {
                musicPlay[genresType] = musicPlay[genresType]!! + play

                if (music[genresType]!!.size < 2) {
                    music[genresType]?.set(i, play)
                } else {
                    val minPlays = music[genresType]!!.minOf { it.value }
                    if (minPlays < play) {
                        val minIndex = music[genresType]!!.values.indexOf(minPlays)
                        val minKey = music[genresType]!!.keys.toList()[minIndex]

                        music[genresType]?.remove(minKey)
                        music[genresType]?.set(i, play)
                    }
                }
            }
        }

        val musicPlayEntries = LinkedList(musicPlay.entries)
        musicPlayEntries.sortByDescending { it.value }

        for (i in 0 until musicPlayEntries.size) {
            val key = musicPlayEntries[i].key
            val musicInfo = LinkedList(music[key]!!.entries)

            musicInfo.sortByDescending { it.value }
            for (m in musicInfo) {
                answer.add(m.key)
            }
        }

        return answer.toIntArray()
    }
}

fun main() {
    println(`베스트앨범`().solution(arrayOf("classic", "pop", "classic", "classic", "pop"), intArrayOf(500, 600, 150, 800, 2500)).contentToString())
}