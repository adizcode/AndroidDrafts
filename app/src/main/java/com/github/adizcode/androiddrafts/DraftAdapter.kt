package com.github.adizcode.androiddrafts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DraftAdapter(private val data: List<Draft>) :
    RecyclerView.Adapter<DraftAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.draft_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.draft_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentDraft = data[position]
        with(holder) {
            textView.text = currentDraft.name
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, currentDraft.activity)
                itemView.context.startActivity(intent)

            }
        }
    }

    override fun getItemCount() = data.size
}