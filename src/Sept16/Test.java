package Sept16;

public class Test {
    public static void main(String[] args){

        int grade = -1;

        if(grade > 0 && grade <= 40 ){
            System.out.println("Fail");
        }
       else if(grade > 40 && grade <= 60){
            System.out.println(" B Grade");
        }
        else if (grade > 60 && grade <= 80){
            System.out.println(" B+ Garde");
        }
        else if(grade > 80 && grade <= 90){
            System.out.println("A");
        }
        else if(grade > 90 && grade <= 99){
            System.out.println("A+");
        }
        else if (grade == 100){
            System.out.println("Alien");
        }
        else{
            System.out.println("Invalid");

        }

    }
}
