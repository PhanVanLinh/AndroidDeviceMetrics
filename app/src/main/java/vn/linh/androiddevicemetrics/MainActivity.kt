package vn.linh.androiddevicemetrics

import android.content.res.Resources
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_device.text = Build.MODEL + " " + Build.MANUFACTURER

        text_dimension.text = "" + getScreenWidth() + " " + getScreenHeight()

        text_density.text = "" + resources.displayMetrics.density

        text_width_height_in_dp.text = "" + getScreenWidth()/resources.displayMetrics.density + " " + getScreenHeight()/resources.displayMetrics.density
    }

    fun getScreenWidth(): Int {
        return Resources.getSystem().getDisplayMetrics().widthPixels
    }

    fun getScreenHeight(): Int {
        return Resources.getSystem().getDisplayMetrics().heightPixels
    }
}
