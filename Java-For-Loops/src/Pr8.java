import java.util.Scanner;

public class Pr8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please a number here:");
        int num= scan.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println(("The number is not a prime number."));
        }
    }
}