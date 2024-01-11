package com.example.buttomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.buttomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show()
                }

                R.id.item2 -> {
                    binding.imageView.setImageResource(R.drawable.face_co)
                    binding.imageView.visibility = VISIBLE
                }

                R.id.item3 -> {
                    binding.textView.text = "You are a good programmer!"
                }

                R.id.item4 -> {
                    binding.imageView.setImageResource(R.drawable.face_co)
                    binding.imageView.visibility = View.INVISIBLE
                }
            }

            true
        }


    }
}