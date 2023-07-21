fun main(args: Array<String>) {

    var playerScore = 0
    var computerScore = 0
    var gameCount = 0
    var playAgain = 1

    while (playAgain == 1) {

        println("Presione cualquier botón para jugar.")
        readLine()
        val playerRoll = (1..6).random() + (1..6).random()
        val computerRoll = (1..6).random() + (1..6).random()

        if (playerRoll > computerRoll) {
            playerScore++
        } else if (playerRoll < computerRoll) {
            computerScore++
        } else {
            //Empate
        }

        println("====Juego #${gameCount+1}====")
        println("====Dados====")
        println("Dados del jugador: $playerRoll")
        println("Dados del computador $computerRoll")
        println()
        println("====Puntajes====")
        println("Puntaje del jugador: $playerScore")
        println("Puntjae del computador: $computerScore")
        println("=====Final ronda====")

        if (playerScore >= 3 || computerScore >= 3) {

            if (playerScore > computerScore) {
                println("Felicitaciones, ganaste el juego")
                println("====Fin del juego====")
            } else {
                println("El computador gano, Suerte en la proxima!")
                println("====Fin del juego====")
            }

            println("Otra partidita? (1-Si 2-No)")
            playAgain = readLine()!!.toInt()

            playerScore = 0
            computerScore = 0
            gameCount++
        }
    }
}