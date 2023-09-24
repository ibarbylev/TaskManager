package com.example.taskmanager


class Pumpkin(val type: String, val isForHalloween: Boolean) {

    // create function addCandle()
    fun addCandle() {
        if (isForHalloween) {
            val c = Candle()
            c.burning()
        } else {
            println("We don't need a candle.")
        }
    }

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}
fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.any { it.lowercase() == "abracadabra" }


        println(res)
}