package com.example.sweeft_tasks

class Task4 {

    private fun addBinary(a: String, b: String): String? {

        var aLength = a.length - 1
        var bLength = b.length - 1
        var carry = 0
        var sum = 0
        val result = StringBuilder()
        while (aLength >= 0 || bLength >= 0 || carry == 1) {
            sum = carry
            if (aLength >= 0) sum = sum + a[aLength].code - '0'.code
            if (bLength >= 0) sum = sum + b[bLength].code - '0'.code
            result.append((sum % 2 + '0'.code).toChar())
            carry = sum / 2
            aLength--
            bLength--
        }
        return result.reverse().toString()
    }

    fun main() {
        val a = "1101"
        val b = "100"
        println("ჯამი: " + addBinary(a, b))
    }
}