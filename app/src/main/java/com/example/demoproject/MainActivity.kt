package com.example.demoproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoproject.databinding.ActivityMainBinding
import com.example.demoproject.utils.SampleData
import com.example.demoproject.adapter.MainAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter= MainAdapter(SampleData.collections)
        }

    }
}