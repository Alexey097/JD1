package HomeWork_3.runners;

import HomeWork_3.calcs.additional.CalculatorWithCounterAutoSuper;
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper task6_5 = new CalculatorWithCounterAutoSuper();
        System.out.println(task6_5.addition(4.1,(task6_5.addition(task6_5.multiplier(15,7),task6_5.powNew(task6_5.division(28,5),2 )))));
        System.out.println(task6_5.getCountOperation());
    }
}
