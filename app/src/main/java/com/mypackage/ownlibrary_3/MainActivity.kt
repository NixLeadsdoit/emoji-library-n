package com.mypackage.ownlibrary_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mypackage.emojis.Emojis.SEPARATOR_DEVIL
import com.mypackage.emojis.Emojis.SEPARATOR_FIRE
import com.mypackage.ownlibrary_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply {
            bDo.setOnClickListener{
                tv.text = "${SEPARATOR_DEVIL}Hello there${SEPARATOR_FIRE}"
            }
            setContentView(root)
        }

    }
}