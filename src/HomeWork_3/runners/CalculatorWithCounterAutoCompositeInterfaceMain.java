package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;
import HomeWork_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface task9_7 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

        double result1 = task9_7.addition( 4.1, task9_7.addition(task9_7.multiplier(15, 7), task9_7.pow(task9_7.division(28, 5), 2)));
        System.out.println(result1);
        System.out.println(task9_7.getCountOperation());
    }
}
