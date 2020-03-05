
val  checkGuessFunction =   { guess:Int, valueToGuess:Int -> Boolean
    println("The number to guess is $valueToGuess")
    if (guess == valueToGuess) {
        println("You guess correctly")
        true
    } else {
        if (guess < valueToGuess) println("Your guess was too low")
        else println("Your guess was too high")
        false
    }
}

class GuessingGameWithSimpleFunction (val checkGuess:(Int, Int)->Boolean) {

    val noOfGuessesAllowed = 3
    var valueWasGuessedCorrectly = true
    var guessesLeft = 0
    var valueToGuess = 0

    fun startNewGame() {
        guessesLeft = noOfGuessesAllowed
        valueWasGuessedCorrectly = false
        valueToGuess = (1..100).random()
    }

    fun playGame() {
        startNewGame()
        while (!valueWasGuessedCorrectly && guessesLeft > 0) {
            println("please guess a number between 1 and 100")
            val guess = obtainGuess()
            valueWasGuessedCorrectly = checkGuess(guess, valueToGuess)
            guessesLeft--
        }
    }

    fun obtainGuess():Int {
        return 42
    }
}