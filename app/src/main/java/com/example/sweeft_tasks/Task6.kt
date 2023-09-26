package com.example.sweeft_tasks


class Task6 {

    private var arr: ArrayList<Int>? = null
    private var map: MutableMap<Int, Int>? = null

    fun remove(x: Int? = null) {
        if (map!!.containsKey(x)) {
            val index = map!![x]!!
            map!!.remove(x)
            val last = arr!!.size - 1
            arr!![index] = arr!![last]
            arr!!.removeAt(last)
            map!![arr!![index]] = index
        }
    }
}