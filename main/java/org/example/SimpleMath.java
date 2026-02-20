package org.example;

public class SimpleMath {

    public Double sum(Double firstNumber,Double secondNumber){
        return firstNumber + secondNumber;
    }

    public Double substract(Double firstNumber,Double secondNumber){
        return firstNumber - secondNumber;
    }

    public Double multiply(Double firstNumber,Double secondNumber){
        return firstNumber * secondNumber;
    }

    public Double divide(Double firstNumber,Double secondNumber){
        if(secondNumber == 0D) throw new ArithmeticException("Cannot divide by zero");
        return firstNumber / secondNumber;
    }

    public Double average(Double firstNumber,Double secondNumber){
        return (firstNumber + secondNumber) / 2;
    }

    public Double square(Double number){
        return Math.pow(number,2);
    }
}
