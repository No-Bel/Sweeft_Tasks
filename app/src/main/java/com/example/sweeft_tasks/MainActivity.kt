package com.example.sweeft_tasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var task1: Task1
    private lateinit var task2: Task2
    private lateinit var task3: Task3
    private lateinit var task4: Task4
    private lateinit var task5: Task5
    private lateinit var task6: Task6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        taskOne()
        taskTwo()
        taskThree()
        taskFour()
        taskFive()
        taskSix()
    }

    private fun taskOne() {
        task1 = Task1()
        task1.main()
    }

    private fun taskTwo() {
        task2 = Task2()
        task2.main()
    }

    private fun taskThree() {
        task3 = Task3()
        task3.main()
    }

    private fun taskFour() {
        task4 = Task4()
        task4.main()
    }

    private fun taskFive() {
        task5 = Task5()
        task5.main()
    }

    private fun taskSix() {
        task6 = Task6()
        task6.remove()
    }
}