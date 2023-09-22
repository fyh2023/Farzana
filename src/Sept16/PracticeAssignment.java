package Sept16;
import javax.swing.*;
import java.util.Scanner;
public class PracticeAssignment {

    public static void main(String[] args) {
        System.out.println("Welcome to Rogers");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your option");
        int option = scanner.nextInt();


        switch (option) {
            case 1:
                System.out.println("English");
                System.out.println("Press 1 for Internet");
                System.out.println("Press 2 for Mobile");
                System.out.println("Press 3 for Cable");

                int x = scanner.nextInt();

                switch (x) {
                    case 1:
                        System.out.println("Internet");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int z = scanner.nextInt();

                        switch (z) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }
                        break;

                    case 2:
                        System.out.println("Mobile");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }
                        break;

                    case 3:
                        System.out.println("Cable");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int b = scanner.nextInt();
                        switch (b) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("French");
                System.out.println("Press 1 for Internet");
                System.out.println("Press 2 for Mobile");
                System.out.println("Press 3 for Cable");

                int y = scanner.nextInt();
                switch (y) {
                    case 1:
                        System.out.println("Internet");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int c = scanner.nextInt();
                        switch (c) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }
                        break;

                    case 2:
                        System.out.println("Mobile");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int d = scanner.nextInt();
                        switch (d) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }
                        break;

                    case 3:
                        System.out.println("Cable");
                        System.out.println("New Connection");
                        System.out.println("Existing Connection");
                        System.out.println("Bill Payment");
                        System.out.println("Technical Support");

                        int e = scanner.nextInt();
                        switch (e) {
                            case 1:
                                System.out.println("New Connection");
                                break;
                            case 2:
                                System.out.println("Existing Connection");
                                break;
                            case 3:
                                System.out.println("Bill Payment");
                                break;
                            case 4:
                                System.out.println("Technical Support");
                                break;
                            default:
                                System.out.println("None");
                        }


                }
            default:
                System.out.println("None");

        }
    }
}
