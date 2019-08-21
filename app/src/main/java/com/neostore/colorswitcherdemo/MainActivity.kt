package com.neostore.colorswitcherdemo

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBitmap = BitmapFactory.decodeResource(resources, R.drawable.bug_189903)
        if (myBitmap != null && !myBitmap.isRecycled) {
            val palette = Palette.from(myBitmap).generate()
            val vibrant: Palette.Swatch? = palette.vibrantSwatch
            val vibrantDark: Palette.Swatch? = palette.darkVibrantSwatch
            val vibrantLight: Palette.Swatch? = palette.lightVibrantSwatch
            if (vibrant != null) {
            /*    vibrantDark?.rgb?.let { containerView.setBackgroundColor(it) }
                vibrantDark?.titleTextColor?.let { titleView.setTextColor(it) }*/

                /*  vibrantLight?.rgb?.let { containerView.setBackgroundColor(it) }
                  vibrantLight?.titleTextColor?.let { titleView.setTextColor(it) }*/

                containerView.setBackgroundColor(vibrant.rgb)
                titleView.setTextColor(vibrant.titleTextColor)
            }
        }

//        Palette.PaletteAsyncListener {
//            val vibrant: Palette.Swatch? = it?.vibrantSwatch
//            if (vibrant != null) {
//                containerView.setBackgroundColor(vibrant.rgb)
//                titleView.setTextColor(vibrant.titleTextColor)
//            }
//        }
    }
}
