package com.example.databindingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val likesViewModel by lazy {
        ViewModelProvider(this)
            .get(LikesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.likesViewModel = likesViewModel
    }
}