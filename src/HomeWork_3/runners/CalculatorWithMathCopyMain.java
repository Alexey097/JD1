package HomeWork_3.runners;

import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy task3_3 = new CalculatorWithMathCopy();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        System.out.println(task3_3.addition(4.1,(task3_3.addition(task3_3.multiplier(15,7),task3_3.pow(task3_3.division(28,5),2 )))));
    }
}
