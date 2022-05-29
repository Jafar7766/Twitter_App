package com.example.twitter_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class PostAdapter(var context: Context, var items: ArrayList<Post>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var feed = items[position]

        if(holder is PostViewHolder){
            var iv_profile = holder.iv_profile
            var iv_post = holder.iv_post
            var iv_fullname = holder.iv_fullname

            iv_profile.setImageResource(feed.profile)
            iv_post.setImageResource(feed.photo)
            iv_fullname.text = feed.fullname
        }
    }

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var iv_profile: ShapeableImageView
        var iv_post: ShapeableImageView
        var iv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            iv_post = view.findViewById(R.id.iv_post)
            iv_fullname = view.findViewById(R.id.tv_fullname)
        }

    }

}