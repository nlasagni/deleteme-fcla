package com.deletemefcla

/**
 * @author Nicola Lasagni on 13/02/2021.
 */
class Counter {

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
