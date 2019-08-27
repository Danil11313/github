package _SQLite

import _Action.Element

class SQLite_comand {
    private var Elements = emptyArray<Element>()

    fun add_SQLite(_Array: Array<Element>): Boolean {
        Elements = _Array
        var _i: Boolean = true
        for (i in 0..Elements.size) {

        }
        return _i
    }

    fun _delete_Elements() {
        Elements = emptyArray<Element>()
    }

    fun _info(): Array<Element> {
        var _Element: Element = Element("798465123", 3.0, 30.0, "300.0", "Gingerbread")
        Elements += _Element
        Elements += _Element
        Elements += _Element
        Elements += _Element
        Elements += _Element

        return Elements
    }
}


