package com.deletemefcla.app

/**
 * @author Nicola Lasagni on 22/03/2021.
 */
class AppCounter {

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
