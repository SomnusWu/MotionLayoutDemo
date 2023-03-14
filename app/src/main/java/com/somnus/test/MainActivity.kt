package com.somnus.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * https://blog.csdn.net/XiaoMu_Mu/article/details/110622109
 * https://juejin.cn/post/6854573206653812743#heading-5
 *
 *
 *
 *
 * ShapeableImageView
 * https://juejin.cn/post/7111500924358492173
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener {

            startActivity(Intent(this, MotionLayoutActivity::class.java))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {

            startActivity(Intent(this, MotionLoginActivity::class.java))
        }
        findViewById<Button>(R.id.button3).setOnClickListener {

            startActivity(Intent(this, MotionLayoutConstraintSetActivity::class.java))
        }
        findViewById<Button>(R.id.button4).setOnClickListener {

            startActivity(Intent(this, MotionKeyPositionActivity::class.java))
        }
        findViewById<Button>(R.id.HenCode).setOnClickListener {
            startActivity(Intent(this, MotionHenCodeActivity::class.java))
        }

        findViewById<Button>(R.id.KeyPosition).setOnClickListener {
            startActivity(Intent(this, MotionKeyPosition1Activity::class.java))
        }
    }
}