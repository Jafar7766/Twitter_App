package com.example.twitter_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var items:ArrayList<Story>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_story,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var story = items[position]
        if(holder is StoryViewHolder){
            var iv_profile = holder.iv_profile
            var iv_fullname = holder.iv_fullname

            iv_profile.setImageResource(story.profile)
            iv_fullname.text = story.fullname
        }
    }

    class StoryViewHolder(view:View) : RecyclerView.ViewHolder(view){
        var iv_profile: ShapeableImageView
        var iv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            iv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }
}