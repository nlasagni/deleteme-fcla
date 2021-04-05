package com.deletemefcla

import io.kotest.core.spec.style.FreeSpec

/**
 * @author Nicola Lasagni on 12/02/2021.
 */
class MainTest : FreeSpec({
    "Test hello world" - {
        assert("Hello World Robert!" == Main.generateHelloWorld("Robert"))
    }
})
