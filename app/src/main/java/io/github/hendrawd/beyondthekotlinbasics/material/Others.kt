package io.github.hendrawd.beyondthekotlinbasics.material

class Others {

    fun main(args: Array<String>) {
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
