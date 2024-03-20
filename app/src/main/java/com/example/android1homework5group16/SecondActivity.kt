package com.example.android1homework5group16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android1homework5group16.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }
    }