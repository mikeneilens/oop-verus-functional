import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest {

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
        val result = listOf(11,5,7,141).myMap(tranformer)
        assertEquals(listOf("11!","5!","7!","141!"), result)
    }

    @Test
    fun `createTableData should only include lists in the createdTable that are not empty`() {
        val resultWithTwoLists = createTableData(listOf("dyson v10", "dyson hair dryer"), listOf("Dyson"))
        assertEquals(2 ,resultWithTwoLists.size)

        val resultWithOnlyProducts = createTableData(listOf("dyson v10", "dyson hair dryer"), listOf())
        assertEquals(1 ,resultWithOnlyProducts.size)

        val resultWithOnlyBrands = createTableData(listOf(), listOf("Dyson"))
        assertEquals(1 ,resultWithOnlyBrands.size)
    }

    @Test
    fun `createTableData2 should only include lists in the createdTable that are not empty`() {
        val resultWithTwoLists = createTableData2(listOf("dyson v10", "dyson hair dryer"), listOf("Dyson"))
        assertEquals(2 ,resultWithTwoLists.size)

        val resultWithOnlyProducts = createTableData2(listOf("dyson v10", "dyson hair dryer"), listOf())
        assertEquals(1 ,resultWithOnlyProducts.size)

        val resultWithOnlyBrands = createTableData2(listOf(), listOf("Dyson"))
        assertEquals(1 ,resultWithOnlyBrands.size)
    }

}

