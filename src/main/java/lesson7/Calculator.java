package lesson7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
//    public static final int MULTIPLICATION = 1;
//    public static final int SUMMARY = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

   private static final Logger logger = LogManager.getLogger(Calculator.class);


    // enum final constants
   public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(int a, int b, Type type) {

       logger.info("Running method calculate");

        double result = 0;
        switch (type) {
            case MULTIPLICATION:
                result = a * b;
                break;
            case SUMMARY:
                result = a + b;
                break;
            case DIVISION:
                result = a / b;
                break;
            case SUBTRACTION:
                result = a - b;
                break;
            default:
                result = -1;
        }
        return result;


    }
}

//        if (type == MULTIPLICATION) {
//            return a * b;
//        } else if (type == SUMMARY) {
//            return a + b;
//        } else if (type == DIVISION) {
//            return a / b;
//        } else if (type == SUBTRACTION) {
//            return a - b;
//        }
//        return 0;
