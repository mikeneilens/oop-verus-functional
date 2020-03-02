fun List<Int>.myMap(transform:(Int)->String):List<String> {
    val result = mutableListOf<String>()

    for (number in this) {
        result.add(transform(number))
    }

    return result
}