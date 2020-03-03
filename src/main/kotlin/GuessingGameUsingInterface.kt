interface CanRefereeGuessingGame {
    fun resetValueToGuess()
    fun askQuestion()
    fun checkGuess(guess:Int):Boolean
}

class GuessingGameUsingInterface(val referee:SomeoneThatCanReferee) {

    val noOfGuessesAllowed = 3
    var valueWasGuessedCorrectly = true
    var guessesLeft = 0

    fun startNewGame() {
        guessesLeft = noOfGuessesAllowed
        valueWasGuessedCorrectly = false
        referee.resetValueToGuess()
    }

    fun playGame() {
        startNewGame()
        while (!valueWasGuessedCorrectly && guessesLeft > 0) {
            referee.askQuestion()
            val guess = obtainGuess()
            valueWasGuessedCorrectly = referee.checkGuess(guess)
            guessesLeft--
        }
    }

    fun obtainGuess():Int {
        return 42
    }
}