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

    private fun spreadOperator(){
        // * = Spread Operator
        // from https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs:
        // When we call a vararg-function, we can pass arguments one-by-one,
        // e.g. asList(1, 2, 3), or, if we already have an array
        // and want to pass its contents to the function,
        // we use the spread operator (prefix the array with *):
        operateVarargs("satu", "kucing", "paijo", "budi")
        val array = arrayOf("satu", "kucing", "paijo", "budi")
        operateVarargs(*array)
    }
}
