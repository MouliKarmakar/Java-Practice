import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
//        Multiplication table of a number.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number here:");
        int number= scan.nextInt();

        for(int i=1;i<=10;i++){
            int product= number*i;
            System.out.println(number +" x "+ i +" = "+ product);
        }

    }
}