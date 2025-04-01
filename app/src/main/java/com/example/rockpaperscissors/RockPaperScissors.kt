package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChocice =""
    println("Rock, Paper or Scissors? Enter your chice!")
    playerChocice = readln()

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    val winner = when{
        playerChocice == computerChoice -> "Tie"
        playerChocice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChocice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChocice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"

    }
    println(computerChoice)
}