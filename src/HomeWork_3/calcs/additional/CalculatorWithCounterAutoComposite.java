package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    CalculatorWithMathExtends pole = new CalculatorWithMathExtends();
    long count = 0;
    public long getCountOperation() {
        return count;
    }
    public void incrementCountOperation() {
        count++;
    }
    public double division(double devident,double devisor){
        incrementCountOperation();
        return pole.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier (double multiplicand,double multiplier){
        incrementCountOperation();
        return  pole.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction (double minuend,double subtrahend){
        incrementCountOperation();
        return pole.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition (double firstTerm,double secondTerm){
        incrementCountOperation();
        return pole.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow (double numberToBeRaised,double power){
        incrementCountOperation();
        return pole.pow(numberToBeRaised, (float) power);
    }
    //Метод МОДУЛЯ числа
    public double module (double numberForModule){
        incrementCountOperation();
        return pole.module(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr (double numberForSqr){
        incrementCountOperation();
        return pole.sqr(numberForSqr);
    }
}
