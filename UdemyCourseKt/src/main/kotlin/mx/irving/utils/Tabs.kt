package mx.irving.utils

import java.lang.StringBuilder

class Tabs {
    private var _value: StringBuilder = StringBuilder()
    var value: String = EMPTY
        private set
        get() = _value.toString()

    fun add() {
        _value.append("\t")
    }

    fun remove() {
        _value.deleteCharAt(0)
    }
}