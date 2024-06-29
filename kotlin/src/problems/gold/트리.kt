package problems.gold

import java.util.*

private var tree = mutableMapOf<Int, MutableList<Int>>()

fun main() = with(Scanner(System.`in`)) {
    val nodeCnt = nextInt()

    // node는 0부터 nodeCnt -1 까지 존재함.
    for (node in 0 until nodeCnt) {
        // parent: node의 부모 노드
        val parent = nextInt()

        // 현재 노드 key값이 map에 존재하지 않으면 새롭게 생성.
        // parent가 -1이고 현재 node key값이 없으면 node key만 생성해주고 continue.
        if (!tree.containsKey(node) && parent == -1) {
            tree[node] = mutableListOf()
            continue
        } else if (!tree.containsKey(node)) {
            tree[node] = mutableListOf()
        } else if (parent == -1) continue

        // tree의 key가 parent인 데이터의 value에 node를 넣어주어야 함.
        if (!tree.containsKey(parent)) tree[parent] = mutableListOf(node)
        else tree[parent]!!.add(node)
    }

    val deleteNode = nextInt()
    // 트리의 노드 안에 있는 자식들의 노드를 모두 제거.
    deleteTree(deleteNode)

    // 현재 살아있는 노드에 남은 deleteNode를 모두 제거
    for (node in tree) {
        node.value.remove(deleteNode)
    }

    var result = 0
    for (nodeData in tree) {
        if (nodeData.value.isEmpty()) result++
    }
    println(result)
}

private fun deleteTree(deleteNode: Int) {
    for (data in tree[deleteNode]!!) {
        // 하위 노드 안에 삭제할 데이터가 남아 있으면 재귀 호출로 하위 데이터를 모두 제거.
        if (tree[data]!!.isNotEmpty()) deleteTree(data)

        tree.remove(data)
    }

    tree.remove(deleteNode)
}