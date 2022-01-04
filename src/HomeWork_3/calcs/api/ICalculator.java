package HomeWork_3.calcs.api;

public interface ICalculator {
    double division(double devident,double devisor);
    double multiplier (double multiplicand,double multiplier);
    double subtraction (double minuend,double subtrahend);
    double addition (double firstTerm,double secondTerm);
    double pow (double numberToBeRaised,double power);
    double module (double numberForModule);
    double sqr (double numberForSqr);
}
