class GuessingGameInheritence: GuessingGame() {
    override fun checkGuess(guess: Int): Boolean {
        println("Your guess was incorrect")
        return false
    }
}