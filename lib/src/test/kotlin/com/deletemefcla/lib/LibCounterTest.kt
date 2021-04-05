package com.deletemefcla.lib

import io.kotest.core.spec.style.FreeSpec

/**
 * @author Nicola Lasagni on 13/02/2021.
 */
class LibCounterTest : FreeSpec({
    "New counter is zero" - {
        assert(LibCounter().getValue() == 0)
    }
    "Counter cannot be negative" - {
        val counter = LibCounter()
        counter.dec()
        assert(LibCounter().getValue() == 0)
    }
    "Counter is incremented by one per time" - {
        val counter = LibCounter()
        counter.inc()
        assert(counter.getValue() == 1)
    }
})
