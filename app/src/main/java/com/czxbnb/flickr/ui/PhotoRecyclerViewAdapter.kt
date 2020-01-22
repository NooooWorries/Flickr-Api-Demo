package com.czxbnb.flickr.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.czxbnb.flickr.R
import com.czxbnb.flickr.databinding.ItemPhotoBinding
import com.czxbnb.flickr.models.post.Photo

class PhotoRecyclerViewAdapter :
    RecyclerView.Adapter<PhotoRecyclerViewAdapter.ViewHolder>() {
    private var photoList: ArrayList<Photo> = ArrayList()
    private lateinit var binding: ItemPhotoBinding
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.item_photo, parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(photoList[position])
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

    fun updatePhotoList(photoList: List<Photo>) {
        this.photoList.clear()
        this.photoList.addAll(photoList)
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val viewModel = PhotoViewModel()

        fun bind(photo: Photo) {
            viewModel.bind(photo)
            binding.viewModel = viewModel
        }
    }
}