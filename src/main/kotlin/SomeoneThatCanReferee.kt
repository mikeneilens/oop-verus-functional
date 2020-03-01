class SomeoneThatCanReferee:CanRefereeGuessingGame {
    var valueToGuess:Int = 0

    override fun resetValueToGuess() {
        valueToGuess = (0..100).random()
    }

    override fun askQuestion() {
        println("please guess a number between 1 and 10")
    }

    override fun checkGuess(guess:Int):Boolean {
        println("You guess correctly")
        return true
    }
}