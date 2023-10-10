package com.example.composition.domain.entity

data class GameSettings (
    val maxValueCount: Int,
    val minCountRightAnswers: Int,
    val minPercentRightAnswers: Int,
    val gameTime: Int
)