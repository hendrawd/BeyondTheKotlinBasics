package io.github.hendrawd.beyondthekotlinbasics.material.reified

import java.util.*

/**
 * @author hendrawd on 10 Oct 2018
 */
fun <T> fromArrayToList(array: Array<T>): List<T> {
    val list = ArrayList<T>()
    Collections.addAll(list, *array)
    return list
}