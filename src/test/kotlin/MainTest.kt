import org.junit.jupiter.api.Assertions.*
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

    @Test
    fun `answer should not be guessed correctly in guessing game with simple function`() {
        val guessingGame = GuessingGameWithSimpleFunction(checkGuess)
        guessingGame.playGame()
        assertFalse(guessingGame.valueWasGuessedCorrectly)
    }

    @Test
    fun `answer should not be guessed correctly in guessing game with high order function`() {
        val guessingGame = GuessingGameHighOrderFunction(refereeCreator)
        guessingGame.playGame()
        assertFalse(guessingGame.valueWasGuessedCorrectly)
    }

    @Test
    fun `my map should transfor a list of numbers into a list of strings`() {
        val tranformer = {number:Int -> "$number!"}
        val result = myMap(listOf(11,5,7,141), tranformer)
        assertEquals(listOf("11!","5!","7!","141!"), result)
    }

}

