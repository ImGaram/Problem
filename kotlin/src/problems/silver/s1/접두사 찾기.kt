package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

private val trie = TrieNode()

private data class TrieNode(
    val child: MutableMap<Char, TrieNode> = mutableMapOf()
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (prefixCnt, searchCnt) = readLine().split(" ").map { it.toInt() }

    for (i in 0 until prefixCnt) {
        insert(readLine())
    }

    var answer = 0
    for (i in 0 until searchCnt) {
        val searchValue = readLine()
        if(get(searchValue) != null) answer++
    }

    println(answer)
}

private fun insert(value: String) {
    var currentNode = trie

    for (add in value) {
        currentNode = currentNode.child[add] ?:
        currentNode.child.computeIfAbsent(add) { TrieNode() }
    }
}

private fun get(value: String): TrieNode? {
    var currentNode = trie

    for (search in value) {
        val childNode = currentNode.child[search] ?: return null
        currentNode = childNode
    }

    return currentNode
}