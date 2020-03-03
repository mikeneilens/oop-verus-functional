
class TypeAheadSearch(val heading:String, val items:List<String>)


fun createTableData(products:List<String>, brands:List<String>):List<TypeAheadSearch> {
    var result = mutableListOf<TypeAheadSearch>()

    if (brands.isNotEmpty()) result.add(TypeAheadSearch("Brands", brands))
    if (products.isNotEmpty()) result.add(TypeAheadSearch("Products", products))

    return result
}

fun createTableData2(products:List<String>, brands:List<String>) = listOf(
    TypeAheadSearch("Brands",brands),
    TypeAheadSearch("Products", products)
    ).filter{typeAheadSearch -> typeAheadSearch.items.isNotEmpty()  }
