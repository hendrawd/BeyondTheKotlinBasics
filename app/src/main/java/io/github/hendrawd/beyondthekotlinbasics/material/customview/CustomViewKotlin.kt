package io.github.hendrawd.beyondthekotlinbasics.material.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import io.github.hendrawd.beyondthekotlinbasics.R

/**
 * @author hendrawd on 09 Oct 2018
 * Not optimized, copy paste from java class(auto convert java to kotlin)
 */
class CustomViewKotlin : View {
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        setBackgroundResource(R.mipmap.ic_launcher_round)
        alpha = .5f
        // and other customizations
    }
}