package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice =""
    while(true){
        println("Rock, Paper or Scissors? Enter your chice!")
        playerChoice = readln()
        if(playerChoice == "Rock"|| playerChoice == "Paper" || playerChoice == "Scissors")
            break
        else
            println("retry enter")
    }

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
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"

    }
    println("computerChocie=" + computerChoice)

    if (winner == "Tie")
        println("It's a tie")
    else
        println(winner +"won")

}