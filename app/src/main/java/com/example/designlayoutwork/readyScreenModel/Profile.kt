package com.example.designlayoutwork.readyScreenModel

data class Profile(
    val name: String,
    val title: String,
    val img: String,
    val lastVisitDays: Int,
    val grade: Float,
    val amountReviews: Int,
    val amountLikes: Int,
    val allUsersAmount: Int,
    val recomendedUsersAmount: Int
)
