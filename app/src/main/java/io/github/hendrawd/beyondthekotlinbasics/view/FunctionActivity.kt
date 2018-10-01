package io.github.hendrawd.beyondthekotlinbasics.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class FunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // example from dicoding
        val nameFunction: (String, String) -> String = { realName, heroName -> "My name is $realName, you can call me $heroName" }
        val nickName = getNickname("Nur Rohman", "Rohmen", nameFunction)

        // more example
        // passing lambda as parameter
        operate(3, { x -> x * x })
        operate(3) { x -> x * x }
        // passing anonymous function as parameter
        operate(2, fun(x): Int {
            return if (x > 10) {
                0
            } else {
                x * x
            }
        })
    }

    // higher order function = function that use other function as parameter
    private fun operate(x: Int, op: (Int) -> Int): Int {
        return op(x)
    }

    fun getNickname(fullName: String, nickName: String, yourName: (String, String) -> String) {
        val result = yourName(fullName, nickName)
        println(result)
    }
}
