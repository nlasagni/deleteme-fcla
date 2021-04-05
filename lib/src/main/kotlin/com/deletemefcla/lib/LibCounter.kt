package com.deletemefcla.lib

/**
 * @author Nicola Lasagni on 22/03/2021.
 */
class LibCounter {

    private var value: Int = 0

    fun inc() {
        value++
    }

    fun dec() {
        if (value > 0) {
            value--
        }
    }

    fun getValue(): Int {
        return value
    }
}
