
val refereeCreator:() -> (Int) -> Boolean = {
    val valueToGuess = (0..100).random();
    { guess:Int -> checkGuessFunction(guess, valueToGuess) }
}

class GuessingGameHighOrderFunction (val createReferee:() -> ((Int)->  Boolean) ) {

    val noOfGuessesAllowed = 3
    var valueWasGuessedCorrectly = true
    var guessesLeft = 0

    fun startNewGame() {
        guessesLeft = noOfGuessesAllowed
        valueWasGuessedCorrectly = false
    }

    fun playGame() {
        startNewGame()
        val checkGuess = createReferee()

        while (!valueWasGuessedCorrectly && guessesLeft > 0) {
            println("please guess a number between 1 and 100")
            val guess = obtainGuess()
            valueWasGuessedCorrectly = checkGuess(guess)
            guessesLeft--
        }
    }

    fun obtainGuess():Int {
        return 42
    }
}