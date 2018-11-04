package io.github.hendrawd.beyondthekotlinbasics.material

/**
 * @author hendrawd on 30 Sep 2018
 */
class StringContainer {
    var content: String = ""

    fun add(stringToAdd: String) {
        content += stringToAdd
    }

    override fun toString(): String {
        return content
    }
}