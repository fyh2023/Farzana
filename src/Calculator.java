import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {


        System.out.println("Welcome to my calculator");
        System.out.println(" 1. Press for addition");
        System.out.println(" 2. Press for subtraction");
        System.out.println(" 3. Press for multiplication");
        System.out.println(" 4. Press for division");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int input = scanner.nextInt();
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Enter the second value");
        int num2 = scanner.nextInt();
        switch(input){
            case 1:
                System.out.println("Result is:"+(num1+num2));
                break;
            case 2:
                System.out.println(num1- num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("None");
        }
    }
}