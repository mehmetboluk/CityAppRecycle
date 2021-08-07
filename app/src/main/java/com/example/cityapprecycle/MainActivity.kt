package com.example.cityapprecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cityapprecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var cityArray : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        cityArray = ArrayList<LandMark>()

        val pisa = LandMark("Pisa Tower", "Italy", R.drawable.pisatower2)
        val colosseum = LandMark("Colosseum", "Italy", R.drawable.collesium)
        val eiffel = LandMark("Eiffel", "France", R.drawable.eiffeil)
        val londonBridge = LandMark("London Bridge", "England", R.drawable.londonbridge)

        cityArray.add(pisa)
        cityArray.add(colosseum)
        cityArray.add(eiffel)
        cityArray.add(londonBridge)

        binding.recycleReview.layoutManager = LinearLayoutManager(this)
        val recycleAdaptor = RecyclerAdaptor(cityArray)
        binding.recycleReview.adapter = recycleAdaptor

    }

}