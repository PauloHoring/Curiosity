package com.paulohoring.curiosity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.paulohoring.curiosity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_new_phrase) {
            var s = ""
        }
    }
}