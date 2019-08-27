package _Action

class Element(_ticker: String, _changes: Double,_price: Double,_changesPercentage: String,_companyName: String) {
    var ticker: String? = null
    private var changes: Double? = null
    private var price: Double? = null
    private var changesPercentage: String? = null
    private var companyName: String? = null

    init {
        ticker = _ticker
        changes = _changes
        price = _price
        changesPercentage = _changesPercentage
        companyName = _companyName
    }

    fun _convert(): Array<String> {
        var _Array: Array<String> = arrayOf(
            companyName.toString(),
            ticker.toString(),
            changes.toString(),
            price.toString(),
            changesPercentage.toString()
        )
        return _Array
    }
}
