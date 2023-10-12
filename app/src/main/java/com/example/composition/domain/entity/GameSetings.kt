package com.example.composition.domain.entity

import java.io.Serializable

data class GameSettings (
    val maxValueCount: Int,
    val minCountRightAnswers: Int,
    val minPercentRightAnswers: Int,
    val gameTime: Int
): Serializable