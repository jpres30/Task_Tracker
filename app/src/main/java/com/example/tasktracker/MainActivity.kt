package com.example.tasktracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val itemTextView = findViewById<TextView>(R.id.textView)
       // val addItemEditText = findViewById<EditText>(R.id.get_task).text.toString()
        val addItemButton = findViewById<Button>(R.id.button)
        val recylerView = findViewById<RecyclerView>(R.id.recyclerView)
        val taskList = mutableListOf<TaskTrackerModel>()
        val adapter = TaskRecylerViewAdapter(taskList)
        recylerView.adapter = adapter
        recylerView.layoutManager = LinearLayoutManager(this)
        addItemButton.setOnClickListener {
            val addItemEditText = findViewById<EditText>(R.id.get_task).text.toString()
            taskList.add(TaskTrackerModel(addItemEditText))

            adapter.notifyDataSetChanged()

        }
    }
}