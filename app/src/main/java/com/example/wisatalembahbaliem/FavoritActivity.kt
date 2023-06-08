package com.example.wisatalembahbaliem

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisatalembahbaliem.databinding.ActivityFavoritBinding

class FavoritActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoritBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}