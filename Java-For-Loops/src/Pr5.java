import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
//        power of any number:

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the first number here:");
        int num1= scan.nextInt();
        System.out.println("please enter the second number here:");
        int num2=scan.nextInt();

        int result=1;
        for(int i=1;i<=num2;i++){
            result *= num1;
        }
        System.out.println(result);

    }
}