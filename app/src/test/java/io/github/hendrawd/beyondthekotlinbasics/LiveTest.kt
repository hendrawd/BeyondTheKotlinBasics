package io.github.hendrawd.beyondthekotlinbasics

import io.github.hendrawd.beyondthekotlinbasics.material.IsValReallyImmutable
import io.github.hendrawd.beyondthekotlinbasics.material.StringContainer
import io.github.hendrawd.beyondthekotlinbasics.material.reified.BaseResponseModel
import io.github.hendrawd.beyondthekotlinbasics.material.reified.toKotlinObject
import org.junit.Test

class LiveTest {
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
        val randomValue = IsValReallyImmutable.RandomValue()
        println("randomValue.content is a val, but randomValue.content will always change when called")
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)

        val incrementedValue = IsValReallyImmutable.IncrementedValue()
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

    @Test
    fun testReifiedInAction(){
        val jsonString = "{\"status_code\":0,\"message\":\"hendrawd ganteng\"}"
        val baseResponseModel = jsonString.toKotlinObject<BaseResponseModel>()
        println(baseResponseModel.status)
        println(baseResponseModel.message)
    }

    private fun operate(args: Array<String>) {
        args.forEach { println(it) }
    }

    private fun operateVarargs(vararg args: String) {
        args.forEach { println(it) }
    }
}
