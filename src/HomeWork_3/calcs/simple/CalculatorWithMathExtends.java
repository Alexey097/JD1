package HomeWork_3.calcs.simple;

import HomeWork_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double powNew (double numberToBeRaised, int power) {
        return Math.pow(numberToBeRaised, power);
    }
    public double moduleNew (double numberForModule) {
        return Math.abs(numberForModule);
    }
    public double sqrNew (double numberForSqr) {
        return Math.sqrt(numberForSqr);
    }
}
