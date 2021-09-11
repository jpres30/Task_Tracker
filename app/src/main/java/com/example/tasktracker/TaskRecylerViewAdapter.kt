package com.example.tasktracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.transition.Hold
import java.util.zip.Inflater

class TaskRecylerViewAdapter(private val taskListItems: MutableList<TaskTrackerModel>):RecyclerView.Adapter<TaskRecylerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val context=parent.context
        val inflater=LayoutInflater.from(context)
        val taskItems=inflater.inflate(R.layout.item_layout,parent,false)
        return ViewHolder(taskItems)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       val currentTaskItem:TaskTrackerModel=taskListItems[position]
        holder.descriptionText.text=currentTaskItem.description
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val descriptionText:TextView=itemView.findViewById(R.id.textView)

    }

    override fun getItemCount(): Int {
      return taskListItems.size

    }

}