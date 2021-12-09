package com.example.exp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.exp02.databinding.Activity3Binding
import com.example.exp02.databinding.ActivityMainBinding

class Activity3 : AppCompatActivity() {
    private lateinit var binding:Activity3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_3)
        val count = intent.getIntExtra("count",0)
        when(count%2){
            0->binding.image.setImageResource(R.drawable.pic01)
            1->binding.image.setImageResource(R.drawable.pic02)
        }
        binding.button.setOnClickListener {
            finish()
        }
    }
}