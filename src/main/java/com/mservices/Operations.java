package com.mservices;

public class Operations {

    public static Long calculWithLong(long number1, long number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "x":
                return number1 * number2;  
            default: 
                break;
        }
        return 0L;   
    }
    public static double calculWithDouble (double number1, double number2, String operator){
        switch (operator) {   
            case "/":
                if (number2 != 0)
                    return number1/number2;
                else 
                    return number1>=0? Double.POSITIVE_INFINITY: Double.NEGATIVE_INFINITY;
            default:
                break;
        }
        return 0.0;
    }
}
