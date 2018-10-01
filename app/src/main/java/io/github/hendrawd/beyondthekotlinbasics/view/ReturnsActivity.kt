package io.github.hendrawd.beyondthekotlinbasics.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class ReturnsActivity : AppCompatActivity() {

    private fun containingFunction() {
        val numbers = 1..100
//        aLabel@
        numbers.forEach(fun(element) {
            if (element % 5 == 0) {
                // local return
                return
//                return@forEach
//                return@containingFunction
//                return@aLabel
            }
        })
        println("Hello!")


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        containingFunction()
    }
}
