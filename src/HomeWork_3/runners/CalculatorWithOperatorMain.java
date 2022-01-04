package HomeWork_3.runners;

import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator task2_5 = new CalculatorWithOperator();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(task2_5.addition(4.1,(task2_5.addition(task2_5.multiplier(15,7),task2_5.pow(task2_5.division(28,5),2 )))));
    }
}
