package com.ali.neumorfism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ali.neumorfism.databinding.ActivityMain2Binding
import com.ali.neumorfism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGotoActivity2.setOnClickListener {
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
    }
}