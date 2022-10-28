fun main() {
    while (true) {
        val sugar = readlnOrNull()!!.toInt()

        var count3Kg = 0
        var count5Kg = 0

        var tempSugar = sugar
        var tempSugar2 = sugar
        var tempSugar3 = sugar

        // 3,5로 처리가 안되는 경우
        var temp = sugar

        if (temp % 5 != 0 || temp % 3 == 0) {
            while (temp > 0) {
                temp-=3

                if (temp % 5 == 0 || temp % 3 == 0) break
                else continue
            }
        }

        if (sugar < 10 && temp % 3 != 0 && temp % 5 != 0) {     // 5보다 큰 안나눠지는 수 거르기
            print(-1)
        } else {
            // 0?
            val tempStr = tempSugar3.toString()
            if (tempStr.substring(tempStr.lastIndex).toInt() == 0 || tempStr.substring(tempStr.lastIndex).toInt() == 5) {
                print(tempSugar3 / 5)
            } else {
                // 3, 5를 쓰는 경우
                while (tempSugar3 >= 5) {
                    tempSugar3 -= 5
                    count5Kg += 1

                    if (tempSugar3 % 3 == 0) break
                    else continue
                }

                print(tempSugar3)
                if (tempSugar3 == 0) {
                    print(count5Kg)
                } else if (tempSugar3 % 3 == 0) {
                    while (tempSugar3 > 0) {
                        tempSugar3 -= 3
                        count3Kg += 1
                    }
                    print(count5Kg + count3Kg)
                } else {
                    // 5만 쓰는 경우
                    while (tempSugar > 6) {
                        tempSugar -= 5
                        count5Kg += 1
                    }

                    if (tempSugar == 5) {
                        print(count5Kg + 1)
                    } else {    // 3만 쓰는 경우
                        while (tempSugar2 > 4) {
                            tempSugar2 -= 3
                            count3Kg += 1
                        }

                        if (tempSugar2 == 3) {
                            print(count3Kg + 1)
                        } else {
                            print("tlqkf")
                        }
                    }
                }
            }

        }
    }
}