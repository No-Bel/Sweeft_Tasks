package com.example.sweeft_tasks

class Task3 {

    private fun notContains(numberList: IntArray): Int {

        val listSize = numberList.size
        val N = 1000010

        val present = BooleanArray(N)
        var maxele = Int.MIN_VALUE

        for (i in 0 until listSize) {
            if (numberList[i] in 1..listSize) present[numberList[i]] = true
            maxele = maxele.coerceAtLeast(numberList[i])
        }

        for (i in 1 until N) if (!present[i]) return i

        return maxele + 1
    }

    fun main() {
        val numberList = intArrayOf(2, 3, -7, 6, 8, 1, -10, 15 )
        println("მეტია 0-ზე და ამ მასივში არ შედის." +notContains(numberList))
    }
}