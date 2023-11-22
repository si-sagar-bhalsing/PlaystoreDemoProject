package com.example.demoproject.utils

import com.example.demoproject.model.MainModel
import com.example.demoproject.model.GameModel

object SampleData {

    private val gameModel= listOf(
        GameModel(Images.imageUrl0),
        GameModel(Images.imageUrl1),
        GameModel(Images.imageUrl2),
        GameModel(Images.imageUrl3),
        GameModel(Images.imageUrl4),
        GameModel(Images.imageUrl5),
        GameModel(Images.imageUrl6),
        GameModel(Images.imageUrl7),
        GameModel(Images.imageUrl8),
        GameModel(Images.imageUrl9)
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