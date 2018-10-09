package io.github.hendrawd.beyondthekotlinbasics.material.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import io.github.hendrawd.beyondthekotlinbasics.R

/**
 * @author hendrawd on 09 Oct 2018
 * Optimized, using @JvmOverloads annotation, primary constructor with default value for parameters,
 * and init block
 */
class CustomViewKotlinOptimized @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    init {
        setBackgroundResource(R.mipmap.ic_launcher_round)
        alpha = .5f
        // and other customizations
    }
}