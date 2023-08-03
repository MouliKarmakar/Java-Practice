import java.util.Scanner;

public class Pr7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));
        System.out.println("enter the number here:");
        int num= scan.nextInt();

        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sumEven= sumEven+i;
            }
            else{
                sumOdd= sumOdd+i;
            }
        }
        System.out.println("Even-sum :" +sumEven);
        System.out.println("Odd-sum :" +sumOdd);
    }
}