package com.saiacademy.builds

class Calculator implements Serializable {

    def steps

    Calculator(steps) {
        this.steps = steps
    }

    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber
    }
}
