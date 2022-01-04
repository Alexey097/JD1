package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterClassic;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends task5_5 = new CalculatorWithMathExtends();
        CalculatorWithCounterClassic counter = new CalculatorWithCounterClassic();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = task5_5.multiplier(15,7);
        counter.incrementCountOperation();
        double result2 = task5_5.division(28,5);
        counter.incrementCountOperation();
        double result3 = task5_5.powNew(result2,2);
        counter.incrementCountOperation();
        double result4 = task5_5.addition(result1,result3);
        counter.incrementCountOperation();
        double result5 = task5_5.addition(4.1,result4);
        counter.incrementCountOperation();
        System.out.println(result5);
        System.out.println(counter.getCountOperation());


    }
}
