class Person(val name:String, val PlaceOfBirth:String, val age:Int)

val listOfPeople = listOf(
        Person("Jimmy", "USA", 42 ),
        Person("Leslie", "UK", 74),
        Person("Susan", "USA", 26),
        Person("Michelle", "France", 35)
)

val totalAgeOfAmericans = listOfPeople
        .filter{person -> (person.PlaceOfBirth == "USA") }
        .map{person -> person.age}
        .sum()
