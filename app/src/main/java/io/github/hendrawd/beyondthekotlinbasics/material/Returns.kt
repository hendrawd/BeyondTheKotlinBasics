package io.github.hendrawd.beyondthekotlinbasics.material

class Returns {

    private fun containingFunction() {
        val numbers = 1..100 // int range
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

    fun main(args: Array<String>) {
        containingFunction()
    }
}
