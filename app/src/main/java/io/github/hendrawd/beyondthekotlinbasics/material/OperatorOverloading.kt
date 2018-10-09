package io.github.hendrawd.beyondthekotlinbasics.material

class OperatorOverloading {

    data class Time(val hours: Int, val mins: Int) {

        // overload plus operator
        operator fun plus(time: Time): Time {
            val minutes = this.mins + time.mins
            val hoursInMinutes = minutes / 60
            val remainingMinutes = minutes % 60
            val hours = this.hours + time.hours + hoursInMinutes
            return Time(hours, remainingMinutes)
        }
    }

    // overload plus operator with extension function
    operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
        stringBuilder.forEach { this.append(it) }
    }

    fun main(args: Array<String>) {
        val newTime = Time(10, 40) + Time(3, 20)
        println(newTime)

        val sb = StringBuilder()
        for (str in sb) {
            str + "Value"
        }
    }
}
