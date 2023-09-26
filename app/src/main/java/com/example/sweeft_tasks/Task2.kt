package com.example.sweeft_tasks

class Task2 {

    private fun minSplit(coins: IntArray, size: Int, amount: Int?): Int {
        if (amount == 0) return 0
        var res = Int.MAX_VALUE

        for (i in 0 until size) {
            if (coins[i] <= amount!!) {
                val sub_res = minSplit(coins, size, amount.minus(coins[i]))
                if (sub_res != Int.MAX_VALUE && sub_res + 1 < res) res = sub_res + 1
            }
        }
        return res
    }

    fun main(amount: Int? = 1) {
        val tetri = intArrayOf(1,5,10,20,50)
        val size = tetri.size
        println("მონეტების მინიმალურ რაოდენობაა: " + minSplit(tetri, size, amount))
    }
}