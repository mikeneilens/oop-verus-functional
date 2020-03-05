class Referee {
    var valueToGuess:Int = 0

    fun resetValueToGuess() {
        valueToGuess = (1..100).random()
    }

    fun askQuestion()  { println("please guess a number between 1 and 100")}

    fun checkGuess(guess:Int):Boolean {
        if (guess == valueToGuess) {
            println("You guess correctly")
            return true
        }
        if (guess < valueToGuess) println("Your guess was too low") else println("Your guess was too high")
        return false
    }

}