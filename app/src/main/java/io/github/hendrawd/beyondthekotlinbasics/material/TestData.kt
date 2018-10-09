package io.github.hendrawd.beyondthekotlinbasics.material

/**
 * @author hendrawd on 30 Sep 2018
 */
data class TestData(
        // always try to use the exact type(non null)
        val parameter: String
)

fun bestPractice(){
    val aString: String? = null
    // set default value if the variable nullable
    // i.e: if we get aString from api call
    TestData(aString ?: "")
}
