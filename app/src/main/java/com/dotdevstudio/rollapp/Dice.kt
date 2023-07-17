package com.dotdevstudio.rollapp

class Dice(val startNumber: Int) {
    fun rollDice(): Int {
        return (1..startNumber).random()
    }
}