package _Action

import _SQLite.SQLite_comand

class Operation {
    private var _SQL_comaind: SQLite_comand = SQLite_comand()
    private var Elements = emptyArray<Element>()

    fun info_SQLite(): Array<Element> {
        Elements = _SQL_comaind._info()
        _SQL_comaind._delete_Elements()
        return Elements
    }

    fun add_Elements(
        ticker: String,
        changes: Double,
        price: Double,
        changesPercentage: String,
        companyName: String
    ): Boolean {
        var _Element: Element = Element(ticker, changes, price, changesPercentage, companyName)
        if (Elements.isEmpty()) {
            Elements += _Element
        } else {
            for (i in 0..Elements.size) {
                if (Elements[i].ticker == _Element.ticker) {
                    Elements += _Element
                    return false
                }
            }
        }
        return true
    }


    fun add_SQLite(): Boolean {

        if (Elements.isEmpty()) {
            return false
        }
        var Bool: Boolean = _SQL_comaind.add_SQLite(Elements)
        _SQL_comaind._delete_Elements()
        return Bool
    }

    fun _Convert_String(_name: Array<Element>): Array<String> {
        var Str_Array: Array<String> = arrayOf("CompanyName", "Ticker", "Changes", "Price", "ChangesPercentage")
        for (i in 0.._name.size - 1)
            Str_Array += _name[i]._convert()
        return Str_Array
    }
}