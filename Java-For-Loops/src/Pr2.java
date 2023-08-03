import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
//        sum of n natural numbers.
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number here:");
        int num=scan.nextInt();

        for(int i=1;i<=num;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}