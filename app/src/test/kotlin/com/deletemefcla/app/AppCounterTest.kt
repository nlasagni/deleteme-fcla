package com.deletemefcla.app

import io.kotest.core.spec.style.FreeSpec

/**
 * @author Nicola Lasagni on 13/02/2021.
 */
class AppCounterTest : FreeSpec({
    "New counter is zero" - {
        assert(AppCounter().getValue() == 0)
    }
    "Counter cannot be negative" - {
        val counter = AppCounter()
        counter.dec()
        assert(AppCounter().getValue() == 0)
    }
    "Counter is incremented by one per time" - {
        val counter = AppCounter()
        counter.inc()
        assert(counter.getValue() == 1)
    }
})
