import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
//        Finding factorial
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number here:");
        int number= scan.nextInt();

        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
}