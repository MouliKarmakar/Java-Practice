import java.util.Scanner;

public class Pr13 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double sum=0;
        System.out.println("Enter a number here:");
        int number= scan.nextInt();
        for(int i=1; i<=number;i++){
            sum += 1.0/i;
        }
        System.out.println(sum);


    }
}