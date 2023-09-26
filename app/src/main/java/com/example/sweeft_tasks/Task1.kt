package com.example.sweeft_tasks

class Task1 {

    private fun singleNumber(numberList: IntArray, listSize: Int): Int {
        for (i in 0 until listSize) {
            var count = 0
            for (j in 0 until listSize) {

                if (numberList[i] == numberList[j]) {
                    count++
                }
            }

            if (count == 1) {
                return numberList[i]
            }
        }
        return -1
    }

     fun main() {
        val ar = intArrayOf(2, 2,5, 3, 4, 5, 3, 4)
        val n = ar.size
         if (singleNumber(ar, n) == -1) {
             println("ყველა რიცხვი მეორდება")
         } else println("არ მეორდება რიცხვი: " + singleNumber(ar, n))
    }
}