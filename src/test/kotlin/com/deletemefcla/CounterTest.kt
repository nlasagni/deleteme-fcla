package com.deletemefcla

import io.kotest.core.spec.style.FreeSpec

/**
 * @author Nicola Lasagni on 13/02/2021.
 */
class CounterTest : FreeSpec({
    "New counter is zero" - {
        assert(Counter().getValue() == 0)
    }
    "Counter cannot be negative" - {
        val counter = Counter()
        counter.dec()
        assert(Counter().getValue() == 0)
    }
    "Counter is incremented by one per time" - {
        val counter = Counter()
        counter.inc()
        assert(counter.getValue() == 1)
    }
})