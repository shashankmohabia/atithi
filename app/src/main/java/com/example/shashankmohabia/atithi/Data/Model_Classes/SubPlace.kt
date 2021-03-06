package com.example.shashankmohabia.atithi.Data.Model_Classes

import android.util.Log

data class SubPlace(
        val name: String,
        val description: String,
        val image_link: String,
        val vr_image_link: String,
        val direction_instruction: MutableMap<String, Pair<Int, Int>>
) {
    companion object {
        val subPlacesList: MutableList<SubPlace> = mutableListOf()
        var currentSubPlaceIndex = 0
        fun updateCurrentSubPlaceIndex(currentSubPlace: String) {
            val index = subPlacesList.indexOf(subPlacesList.find { it.name == currentSubPlace })
            if (index != -1) currentSubPlaceIndex = index
            //Log.d("Shreshth", subPlacesList.indexOf(subPlacesList.find { it.name == currentSubPlace }).toString())
        }
    }
}