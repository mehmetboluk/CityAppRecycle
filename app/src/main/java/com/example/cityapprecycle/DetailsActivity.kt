package com.example.cityapprecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cityapprecycle.databinding.ActivityDetailsBinding

private lateinit var binding: ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val intent = intent
        val landmark = intent.getSerializableExtra("landmark") as LandMark
        binding.tvLandMarkName.text = landmark.name
        binding.tvLandMarkCountry.text = landmark.country
        binding.imageView.setImageResource(landmark.image)

    }
}