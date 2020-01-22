package com.czxbnb.flickr.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.czxbnb.flickr.base.BaseViewModel
import com.czxbnb.flickr.models.post.Photo

class PhotoViewModel : BaseViewModel() {
    private val photoLiveData = MutableLiveData<Photo>()
    val _photoLiveData : LiveData<Photo> = photoLiveData

    private val imageUrlLiveData = MutableLiveData<String>()
    val _imageUrlLiveData : LiveData<String> = imageUrlLiveData

    fun bind(photo: Photo) {
        photoLiveData.value = photo
        imageUrlLiveData.value = "http://farm${photo.farm}.static.flickr.com/${photo.server}/${photo.id}_${photo.secret}.jpg"
    }
}