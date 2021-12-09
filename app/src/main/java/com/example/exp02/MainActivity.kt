package com.example.exp02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.exp02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.image.setOnClickListener {
            when(++count%2){
                0->{
                    binding.image.setImageResource(R.drawable.pic01)
                }
                1->{
                    binding.image.setImageResource(R.drawable.pic02)
                }
            }
        }
        binding.button.setOnClickListener {
            val intent = Intent(this,Activity3::class.java)
            intent.putExtra("count",count)
            startActivity(intent)
        }
    }
}