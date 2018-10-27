package io.github.hendrawd.beyondthekotlinbasics.common

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.glideLoad(image: Any) {
    Glide.with(context)
            .load(image)
            .into(this)
}

fun ImageView.glideCircleCropLoad(image: Any) {
    Glide.with(context)
            .load(image)
            .apply(RequestOptions.circleCropTransform())
            .into(this)
}

@Suppress("DEPRECATION")
fun String.fromHtml(): Spanned {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(this)
    }
}

// top-level function
fun Context.openGooglePlayOfThisApplication() {
    // local/nested function
    fun String.toActionViewIntent(): Intent {
        return Intent(Intent.ACTION_VIEW, Uri.parse(this))
    }
    // what we usually use is member function(function inside a class)

    try {
        startActivity("market://details?id=$packageName".toActionViewIntent())
    } catch (activityNotFoundException: ActivityNotFoundException) {
        startActivity("https://play.google.com/store/apps/details?id=$packageName".toActionViewIntent())
    }
}

// extension property
val String.hasNumber: Boolean
    get() = this.contains("\\d+".toRegex())