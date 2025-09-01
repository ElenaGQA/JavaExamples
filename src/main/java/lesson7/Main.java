package lesson7;

public class Main {
    public static void main(String[] args) {

        try {
            double result = Calculator.calculate(4, 3, Calculator.Type.MULTIPLICATION);
            System.out.println("The result is " + result);
        }
        catch (Exception err){
            System.out.println("The error occurred");
        }
        try {
            double result = Calculator.calculate(4, 3, Calculator.Type.SUBTRACTION);
            System.out.println("The result is " + result);
        }
        catch (Exception err){
            System.out.println("The error occurred");
        }
        try {
            double result = Calculator.calculate(4, 3, Calculator.Type.DIVISION);
            System.out.println("The result is " + result);
        }
        catch (Exception err){
            System.out.println("The error occurred");
        }
        try {
            double result = Calculator.calculate(4, 3, null);
            System.out.println("The result is " + result);
        }
        catch (Exception err){
//            logger.error("Something bad happened");  you can add it to see it in logs
            System.out.println("The error occurred");
          throw err;
        }
        finally {
            System.out.println("Finally block");
        }
    }

}
