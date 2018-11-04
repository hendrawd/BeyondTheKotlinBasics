package io.github.hendrawd.beyondthekotlinbasics.material

import java.util.*

/**
 * @author hendrawd on 30 Sep 2018
 */
class IsValReallyImmutable {

    class RandomValue {
        val content: Int get() = Random().nextInt()
    }

    class IncrementedValue {
        var realVal = 0
        val content: Int get() = ++realVal
    }

    fun main(args: Array<String>) {
        // Please refer to links below to get the concept
        // https://kotlinlang.org/docs/reference/properties.html
        // https://artemzin.com/blog/kotlin-val-does-not-mean-immutable-it-just-means-readonly-yeah/
        // https://blog.danlew.net/2017/05/30/mutable-vals-in-kotlin/

        val randomValue = RandomValue()
        println("randomValue.content is a val, but randomValue.content will always change when called")
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)
        println(randomValue.content)

        val incrementedValue = IncrementedValue()
        println("incrementedValue.content is a val, but incrementedValue.content will always change when called")
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
        println(incrementedValue.content)
    }
}