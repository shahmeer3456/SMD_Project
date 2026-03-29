package com.smartrasoi.app.models

import java.io.Serializable

data class Recipe(
    val id: String,
    val title: String,
    val description: String,
    val time: String,
    val rating: String,
    val isTrending: Boolean = false,
    val imageUrl: String = ""
) : Serializable
