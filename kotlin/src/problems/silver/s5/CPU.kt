package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val assembly = readLine().split(" ")
        val opCode = assembly[0]
        val (rD, rA, rB) = assembly.subList(1, assembly.size).map { it.toInt() }
        val machineLanguage = StringBuilder()

        // 0 ~ 3번
        if (opCode.contains("ADD")) machineLanguage.append("0000")
        else if (opCode.contains("SUB")) machineLanguage.append("0001")
        else if (opCode.contains("MOV")) machineLanguage.append("0010")
        else if (opCode.contains("AND")) machineLanguage.append("0011")
        else if (opCode.contains("OR")) machineLanguage.append("0100")
        else if (opCode.contains("NOT")) machineLanguage.append("0101")
        else if (opCode.contains("MULT")) machineLanguage.append("0110")
        else if (opCode.contains("LSFTL")) machineLanguage.append("0111")
        else if (opCode.contains("LSFTR")) machineLanguage.append("1000")
        else if (opCode.contains("ASFTR")) machineLanguage.append("1001")
        else if (opCode.contains("RL")) machineLanguage.append("1010")
        else if (opCode.contains("RR")) machineLanguage.append("1011")

        // 4번
        if (opCode.last() == 'C') machineLanguage.append("1")
        else machineLanguage.append("0")

        // 5번
        machineLanguage.append("0")

        // 6 ~ 8번
        machineLanguage.append(rD.toString(2).padStart(3, '0'))

        // 9 ~ 11번
        if (opCode.contains("MOV") || opCode.contains("NOT")) machineLanguage.append("000")
        else machineLanguage.append(rA.toString(2).padStart(3, '0'))

        // 12 ~ 15번
        if (opCode.last() == 'C') {
            machineLanguage.append(rB.toString(2).padStart(4, '0'))
        } else {
            machineLanguage.append("${rB.toString(2).padStart(3, '0')}0")
        }

        println(machineLanguage.toString())
    }
}