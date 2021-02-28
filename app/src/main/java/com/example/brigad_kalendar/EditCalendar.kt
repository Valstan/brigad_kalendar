package com.example.brigad_kalendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.brigad_kalendar.databinding.ActivityMainBinding

class EditCalendar : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}