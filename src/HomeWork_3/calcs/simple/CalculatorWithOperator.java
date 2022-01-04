package HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    //Метод ДЕЛЕНИЯ чисел
    public double division(double devident,double devisor){
        return devident/devisor;
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier (double multiplicand,double multiplier){
        return multiplicand*multiplier;
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction (double minuend,double subtrahend){
        return minuend-subtrahend;
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition (double firstTerm,double secondTerm){
        return firstTerm+secondTerm;
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow (double numberToBeRaised,double power){
        double result = 1;
        for (int i = 0;i<power;i++){
            result *=numberToBeRaised;
        }
        return result;
    }
    //Метод МОДУЛЯ числа
    public double module (double numberForModule){
        double result = 0;
        if (numberForModule<0){
            result = numberForModule * -1;
        } else {
            result = numberForModule;
        }
        return result;
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr (double numberForSqr){
        return Math.sqrt(numberForSqr);
    }
}
