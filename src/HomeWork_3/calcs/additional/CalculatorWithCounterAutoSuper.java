package HomeWork_3.calcs.additional;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long counter;
    void increment(){
        counter++;
    }
    public long getCountOperation(){
        return counter;
    }
    //Метод ДЕЛЕНИЯ чисел, переопределяющий родительский метод
    public double division(double devident,double devisor){
        increment();
        return super.division(devident,devisor);
    }
    //Метод УМНОЖЕНИЯ чисел, переопределяющий родительский метод
    public double multiplier (double multiplicand,double multiplier){
        increment();
        return  super.multiplier(multiplicand,multiplier);
    }
    //Метод ВЫЧИТАНИЯ чисел, переопределяющий родительский метод
    public double subtraction (double minuend,double subtrahend){
        increment();
        return super.subtraction(minuend,subtrahend);
    }
    //Метод СЛОЖЕНИЯ чисел, переопределяющий родительский метод
    public double addition (double firstTerm,double secondTerm){
        increment();
        return super.addition(firstTerm,secondTerm);
    }
    //Метод ВОЗВЕДЕНИЯ В СТЕПЕНЬ чисела, переопределяющий родительский метод
    public double powNew (double numberToBeRaised,int power){
        increment();
        return super.powNew(numberToBeRaised,power);
    }
    //Метод МОДУЛЯ числа, переопределяющий родительский метод
    public double module (double numberForModule){
        increment();
        return super.moduleNew(numberForModule);
    }
    //Метод КВАДРАТНОГО КОРНЯ числа, переопределяющий родительский метод
    public double sqr (double numberForSqr){
        increment();
        return super.sqrNew(numberForSqr);
    }
}
