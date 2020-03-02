
object Tuesday

val aTupleUsingTriple = Triple("Mike", "Neilens",1967)

data class TupleForPerson(val firstName:String, val lastName:String, val yearBorn:Int)

fun doSomething() {
    val (firstName1, lastName1, yearBorn1) = aTupleUsingTriple

    val mike = TupleForPerson("mike","neilens", 1967)
    val (firstName2, lastName2, yearBorn2) = mike
}

sealed class ResultOfGuess{
    object Correct:ResultOfGuess()
    class TooLow(val missedBy:Int):ResultOfGuess()
    class TooHigh(val missedBy:Int):ResultOfGuess()
}
val Result = ResultOfGuess.TooLow(missedBy = 25)


sealed class LinkedListWithNoNulls {
    object End:LinkedListWithNoNulls()
    class Link(val value:Int, val next:LinkedListWithNoNulls):LinkedListWithNoNulls()
}

val result = checkGuess(42,76)