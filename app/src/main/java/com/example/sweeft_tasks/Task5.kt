package com.example.sweeft_tasks

class Task5 {

    private fun fib(n: Int): Int {
        return if (n <= 1) n else fib(n - 1) + fib(n - 2)
    }

    private fun countWays(s: Int): Int {
        return fib(s + 1)
    }

    fun main() {
        val s = 2
        println("ასვლის ვარიანტების რაოდენობაა = " + countWays(s))
    }
}