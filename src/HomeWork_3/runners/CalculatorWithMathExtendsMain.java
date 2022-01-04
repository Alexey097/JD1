package HomeWork_3.runners;

import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends task4_4 = new CalculatorWithMathExtends();
        System.out.println(task4_4.addition(4.1,(task4_4.addition(task4_4.multiplier(15,7),task4_4.powNew(task4_4.division(28,5),2 )))));

    }
}
