package by.epam.calculatorTest;

public class Calculator {
    final static int ROUND_VALUE = 10;

    public static double sum(double firstParam, double secondParam){
        double result;
        result = firstParam + secondParam;
        return Math.rint(ROUND_VALUE*result)/ROUND_VALUE;
    }
    public static double subtraction(double firstParam, double secondParam){
        double result;
        result = firstParam - secondParam;
        return Math.rint(ROUND_VALUE*result)/ROUND_VALUE;
    }
    public static double multiplication(double firstParam, double secondParam){
        double result;
        result = firstParam * secondParam;
        return Math.rint(ROUND_VALUE*result)/ROUND_VALUE;
    }
    public static double division(double firstParam, double secondParam){
        double result;
        result = firstParam / secondParam;
        return Math.rint(ROUND_VALUE*result)/ROUND_VALUE;
    }

}
