package io.github.hendrawd.beyondthekotlinbasics

import io.github.hendrawd.beyondthekotlinbasics.view.IsValReallyImmutableActivity
import io.github.hendrawd.beyondthekotlinbasics.view.StringContainer
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    private fun containingFunction() {
        val numbers = 1..100

//        numbers.forEach(fun(element) {
//            if (element % 5 == 0) {
//                return
//            }
//        })
        numbers.forEach {
            if (it % 5 == 0) {
                return
            }
        }
        println("Hello!")
    }

    @Test
    fun testReturns() {
        containingFunction()
    }

    @Test
    fun test() {
        val randomValue = IsValReallyImmutableActivity.RandomValue()
        println("randomValue.content is a val, but randomValue.content will always change when called")
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)

        val incrementedValue = IsValReallyImmutableActivity.IncrementedValue()
        println("incrementedValue.content is a val, but incrementedValue.content will always change when called")
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
    }

    @Test
    fun testKotlinTasteJava() {
//        // run, with, apply, also, let
//        val returnedValue = StringContainer().apply {
//            add("1\n")
//            add("2\n")
//            add("3\n")
//            add("4\n")
//            add("5\n")
//            add("6\n")
//        }
//        println(returnedValue.content)

//        val returnedValue = StringContainer().run {
//            for(i in 1 until 6){
//                add("$i\n")
//            }
//            this
//        }
//        println(returnedValue.content)

        println(StringContainer().apply {
            (1..6).forEach {
                add("$it\n")
            }
        }.content)

//        repeat(6){
//            println("$it\n")
//        }
    }

    @Test
    fun testVarargs() {
        // varargs
//        operate(arrayOf("a", "b"))
//        operate("a", "b")
        operateVarargs("a", "b")
    }

    private fun operate(args: Array<String>) {
        args.forEach { println(it) }
    }

    private fun operateVarargs(vararg args: String) {
        args.forEach { println(it) }
    }
}
