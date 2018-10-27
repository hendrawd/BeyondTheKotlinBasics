package io.github.hendrawd.beyondthekotlinbasics.material

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import io.github.hendrawd.beyondthekotlinbasics.R
import io.github.hendrawd.beyondthekotlinbasics.common.*
import kotlinx.android.synthetic.main.activity_main.*

class LeveragingKotlinExtensionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun leveragingExtensionFunction() {
        // Case 1: load image with glide
        val imageUrl = "https://avatars2.githubusercontent.com/u/9481791"
        // without
        Glide.with(ivProfilePhoto.context)
                .load(imageUrl)
                .into(ivProfilePhoto)
        // with
        ivProfilePhoto.glideLoad(imageUrl)

        // without
        Glide.with(ivProfilePhoto.context)
                .load(imageUrl)
                .apply(RequestOptions.circleCropTransform())
                .into(ivProfilePhoto)
        // with
        ivProfilePhoto.glideCircleCropLoad(imageUrl)

        // Case 2: convert text with html format to get the html style
        // without
        val htmlString = "Saya emang <b>ganteng</b>"
        var formattedText =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    Html.fromHtml(htmlString, Html.FROM_HTML_MODE_LEGACY)
                } else {
                    @Suppress("DEPRECATION")
                    Html.fromHtml(htmlString)
                }
        // with
        formattedText = htmlString.fromHtml()

        // Case 3: open google play store for current app
        // without
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName")))
        } catch (activityNotFoundException: ActivityNotFoundException) {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
        }
        // with
        openGooglePlayOfThisApplication()

        // Case 4: check if a String contains at least 1 number
        // without
        val stringHasNumberWithout: Boolean = "this is a string and has 1 number"
                .contains("\\d+".toRegex())
        // with
        val stringHasNumberWith: Boolean = "this is a string and has 1 number"
                .hasNumber
    }
}
