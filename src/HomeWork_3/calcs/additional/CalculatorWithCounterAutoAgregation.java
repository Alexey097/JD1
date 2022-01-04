package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    CalculatorWithMathCopy calc1;
    CalculatorWithOperator calc2;
    CalculatorWithMathExtends calc3;
    private long count = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy someMath) {
        this.calc1 = someMath;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator someMathAgain) {
        this.calc2 = someMathAgain;
    }
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends someMathAgainAndAgain) {
        this.calc3 = someMathAgainAndAgain;
    }
    public long getCountOperation() {
        return count;
    }
    public void incrementCountOperation() {
        count++;
    }
    public double division1(double devident,double devisor){
        incrementCountOperation();
        return calc1.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier1 (double multiplicand,double multiplier){
        incrementCountOperation();
        return  calc1.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction1 (double minuend,double subtrahend){
        incrementCountOperation();
        return calc1.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition1 (double firstTerm,double secondTerm){
        incrementCountOperation();
        return calc1.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow1 (double numberToBeRaised,double power){
        incrementCountOperation();
        return calc1.pow(numberToBeRaised, (float) power);
    }
    //Метод МОДУЛЯ числа
    public double module1 (double numberForModule){
        incrementCountOperation();
        return calc1.module(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr1 (double numberForSqr){
        incrementCountOperation();
        return calc1.sqr(numberForSqr);
    }
    public double division2(double devident,double devisor){
        incrementCountOperation();
        return calc2.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier2 (double multiplicand,double multiplier){
        incrementCountOperation();
        return  calc2.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction2 (double minuend,double subtrahend){
        incrementCountOperation();
        return calc2.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition2 (double firstTerm,double secondTerm){
        incrementCountOperation();
        return calc2.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow2 (double numberToBeRaised,double power){
        incrementCountOperation();
        return calc2.pow(numberToBeRaised, (float) power);
    }
    //Метод МОДУЛЯ числа
    public double module2 (double numberForModule){
        incrementCountOperation();
        return calc2.module(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr2 (double numberForSqr){
        incrementCountOperation();
        return calc2.sqr(numberForSqr);
    }
    public double division3(double devident,double devisor){
        incrementCountOperation();
        return calc3.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел
    public double multiplier3 (double multiplicand,double multiplier){
        incrementCountOperation();
        return  calc3.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел
    public double subtraction3 (double minuend,double subtrahend){
        incrementCountOperation();
        return calc3.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел
    public double addition3 (double firstTerm,double secondTerm){
        incrementCountOperation();
        return calc3.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела
    public double pow3 (double numberToBeRaised,double power){
        incrementCountOperation();
        return calc3.pow(numberToBeRaised, (float) power);
    }
    //Метод МОДУЛЯ числа
    public double module3 (double numberForModule){
        incrementCountOperation();
        return calc3.module(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа
    public double sqr3 (double numberForSqr){
        incrementCountOperation();
        return calc3.sqr(numberForSqr);
    }
}
