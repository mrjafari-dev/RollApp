package com.dotdevstudio.rollapp

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
 fun generatesNumber(){
    val dice = Dice(6)
        val rollResult = dice.rollDice()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
 }
}