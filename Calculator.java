import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println("Welcome, Mr " + name + ", to The Ultra-basic-Calculator");

        System.out.println("Below is a Guide to the Ultra-Basic-Calculator: \n 1. Enter a number of your choice \n 2. Enter operator of your choice \n 3. Enter another number of your choice \n After following these steps you should get the answer. \n Press (y) to proceeed...");
        String enter = scanner.next();

        System.out.println("Enter number");
        Integer num1 = scanner.nextInt();

        System.out.println("Choose operator ( * , / , *, - )");
        String operator = scanner.next();

        System.out.println("Enter number");
        Integer num2 = scanner.nextInt();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            
            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if( num2 == 0 ) {
                    System.out.println("Canannot divid by 0");
                } else {
                    result = num1 / num2;
                }
                break;
        
            default:
                System.out.println("Undefined");
                break;
        }

        System.out.println("Answer is: " + result);

        scanner.close();
    }
}