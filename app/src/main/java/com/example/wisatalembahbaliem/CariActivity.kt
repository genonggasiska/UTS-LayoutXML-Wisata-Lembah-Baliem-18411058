package com.example.wisatalembahbaliem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisatalembahbaliem.databinding.ActivityCariBinding

class CariActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityCariBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCariBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}