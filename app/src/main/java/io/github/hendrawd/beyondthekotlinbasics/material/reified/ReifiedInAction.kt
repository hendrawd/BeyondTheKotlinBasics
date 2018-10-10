package io.github.hendrawd.beyondthekotlinbasics.material.reified

import com.google.gson.Gson

/**
 * @author hendrawd on 10 Oct 2018
 */
fun <T> myGenericFun(clazz: Class<T>) {
    // In an ordinary generic function like myGenericFun,
    // you can’t access the type T because it is, like in Java,
    // erased at runtime and thus only available at compile time.
    // Therefore, if you want to use the generic type as a normal Class in the function body,
    // you need to pass the class as a parameter like the parameter clazz in the above example.
    // That’s correct and works fine but makes it a bit unsightly for the caller.
}

//fun <T> String.toKotlinObject(): T {
//    // does not compile!
//    return Gson().fromJson(this, T::class.java)
//}

inline fun <reified T> String.toKotlinObject(): T {
    return Gson().fromJson(this, T::class.java)
}

fun main(args: Array<String>) {
    val jsonString = "{\"status_code\":0,\"message\":\"hendrawd ganteng\"}"
    // does not compile!
    // Because inline means that the byte code will be copied to the corresponding class
    // while this function is a top-level function(doesn't have parent class)
    val baseResponseModel = jsonString.toKotlinObject<BaseResponseModel>()
    println(baseResponseModel.status)
    println(baseResponseModel.message)
}
