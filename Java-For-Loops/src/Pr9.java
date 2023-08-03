import java.util.Scanner;

public class Pr9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));


        int num1 ,num2;
        char choice;

        do {
            System.out.println("enter the numbers here:");
            num1= scan.nextInt();
            System.out.println("enter the numbers here:");
            num2= scan.nextInt();

            int sum=num1+num2;
            System.out.println(sum);

            System.out.println("If you want to run this code again; type (y or Y) :");
            choice= scan.next().charAt(0);

            System.out.println();
        }while (choice=='y'||choice=='Y');
    }
}