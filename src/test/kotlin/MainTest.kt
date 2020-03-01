import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun `dog should wag tail when instructed`() {
        val mike = Person("mike")
        val myDog = Dog(name = "rover", owner = mike)
        myDog.wagTail()
        assertTrue(myDog.tailIsWagging)
    }

    @Test
    fun `answer should not be guessed correctly in guessing game`() {
        val guessingGame = GuessingGame()
        guessingGame.playGame()
        assertFalse(guessingGame.valueWasGuessedCorrectly)
    }

    @Test
    fun `answer should not be guessed correctly in guessing game inheritence`() {
        val guessingGame = GuessingGameInheritence()
        guessingGame.playGame()
        assertFalse(guessingGame.valueWasGuessedCorrectly)
    }

    @Test
    fun `answer should not be guessed correctly in guessing game composition`() {
        val aReferee = Referee()
        val guessingGame = GuessingGameComposition(aReferee)
        guessingGame.playGame()
        assertFalse(guessingGame.valueWasGuessedCorrectly)
    }
    @Test
    fun `answer should be guessed correctly in guessing game composition with interface`() {
        val aReferee = SomeoneThatCanReferee()
        val guessingGame = GuessingGameUsingInterface(aReferee)
        guessingGame.playGame()
        assertTrue(guessingGame.valueWasGuessedCorrectly)
    }
}

