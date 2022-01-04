package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork_3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite first = new CalculatorWithCounterAutoComposite();
        double result1 = first.addition( 4.1, first.addition(first.multiplier(15, 7), first.pow(first.division(28, 5), 2)));
        System.out.println(result1);
        System.out.println(first.getCountOperation());

        CalculatorWithCounterAutoAgregation second = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result2 = second.addition1( 4.1, second.addition1(second.multiplier1(15, 7), second.pow1(second.division1(28, 5), 2)));
        System.out.println(result2);
        System.out.println(second.getCountOperation());
    }
}
