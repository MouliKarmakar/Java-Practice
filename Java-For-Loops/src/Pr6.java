import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
//        reverse the integer.

        Scanner scan=new Scanner((System.in));
        System.out.println("enter the number here:");
        int num= scan.nextInt();

        int i=num;
        int reverse=0;
        while(i>0){
            int remainder= i%10;
            reverse= (reverse*10)+ remainder;
            i /=10;
        }
        System.out.println(reverse);
    }
}