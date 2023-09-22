package Sept16;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rogers Connection");
        System.out.println("Press 1 English");
        System.out.println("Press 2 French");
        System.out.println("press 3 Spanish");
        int x = scanner.nextInt();

        switch (x){
            case 1:
                System.out.println("English");
                System.out.println("Press 1 for TV");
                System.out.println("Press 2 for Internet");
                System.out.println("Press 3 for Cell Phone");
                int y = scanner.nextInt();
                switch (y){
                    case 1:
                        System.out.println("TV");
                        break;
                    case 2:
                        System.out.println("Internet");
                        break;
                    case 3:
                        System.out.println("Cell phone");
                        break;
                    default:
                        System.out.println("None");
                }
                break;
            case 2:
                System.out.println("French");
                System.out.println("Press 1 for TV");
                System.out.println("Press 2 for Internet");
                System.out.println("Press 3 for Cell Phone");
                break;
            case 3:
                System.out.println("Spanish");
                System.out.println(" Press 1 for TV");
                System.out.println("Press 2 for internet");
                System.out.println("Press 3 for Cell phone");
                break;
            default:
                System.out.println("None");






        }

    }
}
