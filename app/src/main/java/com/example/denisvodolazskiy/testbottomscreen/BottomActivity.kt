package com.example.denisvodolazskiy.testbottomscreen

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class BottomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.bottom_dialog_anim_in, R.anim.bottom_dialog_anim_out)

        setContentView(R.layout.content_bottom)
        //optional
        setFinishOnTouchOutside(true)

        findViewById<View>(R.id.btnDone).setOnClickListener { finish() }

        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val lp = window.attributes
        lp.gravity = Gravity.BOTTOM
        window.attributes = lp
    }

    override fun onPause() {
        super.onPause()
        if (isFinishing) {
            overridePendingTransition(R.anim.bottom_dialog_anim_in, R.anim.bottom_dialog_anim_out)
        }
    }
}