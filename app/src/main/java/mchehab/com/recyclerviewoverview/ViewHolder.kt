package mchehab.com.recyclerviewoverview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var textView: TextView = itemView.findViewById(R.id.textView)

    fun bindData(model: Model){
        textView.text = model.text
    }
}