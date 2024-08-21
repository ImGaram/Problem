package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

private val tree = Node("A", null, null)

private data class Node(
    val value: String,
    var left: Node?,
    var right: Node?,
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val (number, left, right) = readLine().split(" ")

        insertNode(tree, number, left, right)
    }

    frontTraversal(tree)
    println()

    middleTraversal(tree)
    println()

    endTraversal(tree)
}

private fun insertNode(tree: Node?, value: String, left: String, right: String) {
    if (tree?.value == value) {
        tree.left = if (left == ".") null else Node(left, null, null)
        tree.right = if (right == ".") null else Node(right, null, null)
    } else {
        if (tree?.left != null) insertNode(tree.left, value, left, right)
        if (tree?.right != null) insertNode(tree.right, value, left, right)
    }
}

private fun frontTraversal(node: Node?) {
    if (node == null) return

    // 전위 순회: 루트 -> 왼쪽 -> 오른쪽.
    print(node.value)
    frontTraversal(node.left)
    frontTraversal(node.right)
}

private fun middleTraversal(node: Node?) {
    if (node == null) return

    // 중위 순회: 왼쪽 자식 -> 루트 -> 오른쪽 자식.
    middleTraversal(node.left)
    print(node.value)
    middleTraversal(node.right)
}

private fun endTraversal(node: Node?) {
    if (node == null) return

    // 후위 순회: 왼쪽 -> 오른쪽 -> 루트.
    endTraversal(node.left)
    endTraversal(node.right)
    print(node.value)
}