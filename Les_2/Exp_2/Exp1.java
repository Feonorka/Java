package Les_2.Exp_2;

public class Exp1 {

    int a = 5;
    int b = 10;

    public int add(int a, int b) {
        int result = a + b;
        log("Added " + a + " and " + b + " to get " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        log("Subtracted " + b + " from " + a + " to get " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        log("Multiplied " + a + " and " + b + " to get"+result);
        return result;                }

    public double divide(double a, double b) {
        double result = a / b;  // division by zero will throw an exception!  Be careful!  
        log("Divided "+a+" by "+b+" to get "+result);   // Log the operation and the results.  

        return result;     // Return the results of the operation.  

    }

    private void log(String message) { // This method logs the operations and results of our calculator.  

       System.out.println(message); // Print out the message that was passed in as an argument.  

    }

}