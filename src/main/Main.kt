package main

import impls.FunctionsImpl
import tests.FunctionsTest

fun main() {
    val functionsTest = FunctionsTest()

    functionsTest.invertTest()
    functionsTest.calculateTest()
    functionsTest.isPalindromeTest()
    functionsTest.splitterSorterTest()
    functionsTest.uniqueCounterTest()
    functionsTest.substringCounterTest()
}