import java.util.Scanner;

public class Pr11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1, num2;
        char choice;

        do {
            System.out.println("Enter the first number here:");
            num1= scan.nextInt();

            System.out.println("Enter the next number here:");
            num2= scan.nextInt();

            if(num1>num2){
                System.out.println("Greater is :"+ num1);
            }
            else{
                System.out.println("Greater is :"+ num2);
            }

            System.out.println("enter (y/n); based on your decision about if you want to continue or not?");
            choice= scan.next().charAt(0);

            System.out.println();
        }while(choice=='y'||choice=='Y');
    }
}