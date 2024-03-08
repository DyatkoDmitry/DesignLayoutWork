package com.example.designlayoutwork.readyScreenModel

class RecommendedUsersIcons {

     private val recommendedUsers = listOf(
         "photo1",
         "photo2",
         "photo3",
         "photo4",
         "photo5",
         "photo6",
         "photo7",
         "photo8",
         "photo9",
         "photo10"
     )

    fun getRandomRecUser(): String = recommendedUsers.random()
}