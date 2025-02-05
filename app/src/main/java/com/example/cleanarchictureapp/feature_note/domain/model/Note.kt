package com.example.cleanarchictureapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchictureapp.ui.theme.BabyBlue
import com.example.cleanarchictureapp.ui.theme.LightGreen
import com.example.cleanarchictureapp.ui.theme.RedOrange
import com.example.cleanarchictureapp.ui.theme.RedPink
import com.example.cleanarchictureapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: String,
    val color: Int,

    @PrimaryKey
    val id: Int? = null
) {

    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
