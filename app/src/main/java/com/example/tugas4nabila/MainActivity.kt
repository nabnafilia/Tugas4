package com.example.tugas4nabila

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ItemAdapter
    private val items = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        adapter = ItemAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Add Button Click Listener
        addButton.setOnClickListener {
            val newItem = Item("Item ${items.size + 1}")
            adapter.addItem(newItem)
        }
    }
}
