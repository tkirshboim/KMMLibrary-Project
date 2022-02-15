package me.wverdese.sample.app

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}