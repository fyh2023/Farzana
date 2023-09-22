package Sept12;

public class CondionalOp {
    public static void main(String[] args){
        int age = 35;
        boolean haslicense = true;

        if(age < 16){
            System.out.println("Not eligible to drive");
        }
        else if(age <= 16 && age>= 19 && haslicense){
            System.out.println("Not eligible to drive on highway and BAL must be 0.00");
        } else if(age >19 && age< 65 && haslicense);{
            System.out.println("Eligible to drive and BAL must be 0.00");
        }if (age> 65 && !haslicense);{
            System.out.println("Need to take permision");
        }
    }
}
