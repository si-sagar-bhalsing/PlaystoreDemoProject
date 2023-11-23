package com.example.demoproject.utils

import com.example.demoproject.model.MainModel
import com.example.demoproject.model.GameModel

object SampleData {

    private val gameModel= listOf(
        GameModel(Images.imageUrl0,"Clash Of Clans"),
        GameModel(Images.imageUrl1,"Valorant"),
        GameModel(Images.imageUrl2,"CS:GO"),
        GameModel(Images.imageUrl3,"League Of Legends"),
        GameModel(Images.imageUrl4,"Subway Surfers"),
        GameModel(Images.imageUrl5,"Pubg Mobile"),
        GameModel(Images.imageUrl6,"Clash Royale"),
        GameModel(Images.imageUrl7,"8 Ball Pool"),
        GameModel(Images.imageUrl8,"Minecraft"),
        GameModel(Images.imageUrl9,"Asphalt 9")
    )

    val collections = listOf(
        MainModel("All Game" , gameModel),
        MainModel("Want to see" , gameModel.reversed()),
        MainModel("Popular Games" , gameModel.shuffled()),
        MainModel("Top Rated Games" , gameModel) ,
        MainModel("All Game" , gameModel),
        MainModel("Want to see" , gameModel.reversed()),
        MainModel("Popular Games" , gameModel.shuffled()),
        MainModel("Top Rated Games" , gameModel)


    )
}