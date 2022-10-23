package com.example.composecamp.kotlin

import com.example.composecamp.kotlin.Quiz.StudentProgress.printProgressBar

/**
 * Created by Dede Dari Rahmadi on 21/10/22
 */

/**
 * terjadi pengulangan, kita akan membuat sebuah Generic Class
 */

class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

/**
 * Generic Class
 */
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

/**
 * Enum Class
 */
enum class Difficulty {
    EASY, MEDIUM, HARD
}


class Quiz{
    val question1 = Question<String>(questionText = "apaa?", "benar", Difficulty.MEDIUM)
    val question2 = Question<Boolean>(questionText = "benar atau tidak?", true, Difficulty.EASY)
    val question3 = Question<Int>(questionText = "berapa hayo?", 1, Difficulty.HARD)

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()

    }

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3

        fun Quiz.StudentProgress.printProgressBar() {
            repeat(Quiz.answered) { print("▓") }
            repeat(Quiz.total - Quiz.answered) { print("▒") }
            println()
            println(Quiz.progressText)
        }

    }
}

val Quiz.StudentProgress.progressText: String
    get() = "$answered of $total answered"


fun main(){

    //default
    Quiz.printProgressBar()
    val quiz = Quiz()
    quiz.printQuiz()


    //with apply()
//    Quiz().apply {
//        printQuiz()
//    }
}