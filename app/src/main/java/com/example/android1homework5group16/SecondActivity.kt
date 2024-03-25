package com.example.android1homework5group16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android1homework5group16.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val carsListAdapter = CarsListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillCarsList()
        setupRecyclerView()
        }

    private fun fillCarsList() {
        val carsList = listOf(
            Car("БмВ", R.drawable.img1,4,210),
            Car("Ламборгини", R.drawable.img2,4,300),
            Car("Порша", R.drawable.img3,4,220),
            Car("Волва", R.drawable.img4,4,100),
            Car("Мерседес", R.drawable.img5,4,280),
            Car("Формула1", R.drawable.img6,4,300),
            Car("Мустанг", R.drawable.img7,4,200),
            Car("Банана", R.drawable.img8,4,110),
        )
        carsListAdapter.setData(carsList)
    }


    private fun setupRecyclerView() {
        binding.rvCar.adapter = carsListAdapter
    }
}