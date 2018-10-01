package io.github.hendrawd.beyondthekotlinbasics.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class OthersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // run, with, apply, also, let
//        var aString = "hendra emang ganteng sekali tiada tara"
        println(StringContainer().apply {
            add((1..6).toString())
        })

        // compare value and object
//        val otherString = "other string"
//        val isStringsEqual = aString == otherString
        // kenapa pake ==?, kenapa ga pake equals?

        // varargs
        operate(arrayOf("a", "b"))
//        operate("a", "b")
//        operateVarargs("a", "b")
    }

    private fun operate(args: Array<String>) {
        args.forEach { println(it) }
    }

    private fun operateVarargs(vararg args: String) {
        args.forEach { println(it) }
    }
}
