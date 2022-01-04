package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator iCalculator;
    private long count = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }
    private void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }
    public double division(double devident,double devisor){
        incrementCountOperation();
        return iCalculator.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier (double multiplicand,double multiplier){
        incrementCountOperation();
        return  iCalculator.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction (double minuend,double subtrahend){
        incrementCountOperation();
        return iCalculator.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition (double firstTerm,double secondTerm){
        incrementCountOperation();
        return iCalculator.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow (double numberToBeRaised,double power){
        incrementCountOperation();
        return iCalculator.pow(numberToBeRaised,power);
    }
    //Метод МОДУЛЯ числа
    public double module (double numberForModule){
        incrementCountOperation();
        return iCalculator.module(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr (double numberForSqr){
        incrementCountOperation();
        return iCalculator.sqr(numberForSqr);
    }
}
