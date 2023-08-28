package com.example.calculator

sealed class CalculatorOperation(val symbol: String) {
    object Plus : CalculatorOperation("+")
    object Minus : CalculatorOperation("-")
    object Multiply : CalculatorOperation("x")
    object Divide : CalculatorOperation(":")
}
