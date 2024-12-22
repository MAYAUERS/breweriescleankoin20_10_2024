package com.demo.breweriescleankoin20_10_2024.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.breweriescleankoin20_10_2024.R
import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries
import com.demo.breweriescleankoin20_10_2024.viewmodel.BrewriesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var breweriesAdapter: BreweriesAdapter
    private val brewriesViewModel:BrewriesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        brewriesViewModel.getBreweries()
        brewriesViewModel.breweries.observe(this){
                breweriesAdapter = BreweriesAdapter(it as ArrayList<Breweries>)
                recyclerView.adapter = breweriesAdapter
        }
    }
}