open class GuessingGame() {

    val noOfGuessesAllowed = 3
    var valueWasGuessedCorrectly = true
    var valueToGuess = 0
    var guessesLeft = 0

    fun startNewGame() {
        guessesLeft = noOfGuessesAllowed
        valueWasGuessedCorrectly = false
        valueToGuess = (0..100).random()
    }

    fun playGame() {
        startNewGame()
        while (!valueWasGuessedCorrectly && guessesLeft > 0) {
            println("please guess a number between 1 and 100")
            val guess = obtainGuess()
            valueWasGuessedCorrectly = checkGuess(guess)
            guessesLeft--
        }
    }
    open fun checkGuess(guess:Int):Boolean {
        if (guess == valueToGuess) {
            println("You guess correctly")
            return true
        }
        if (guess < valueToGuess) println("Your guess was too low") else println("Your guess was too high")
        return false
    }
    fun obtainGuess():Int {
        return 42
    }
}