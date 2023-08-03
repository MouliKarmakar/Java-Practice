import java.util.Scanner;

public class Pr10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        int countPositive= 0;
        int countNegative=0;
        int countZero=0;
        char choice;
        do{
            System.out.println("Enter the number here:");
            number= scan.nextInt();
            if(number>0){
                countPositive++;
            }
            else if (number<0){
                countNegative++;
                }
            else{
                countZero++;
            }

            System.out.println("If you want to continue or not type(y/n) :");
            choice =scan.next().charAt(0);

            System.out.println();
        }while(choice=='y'||choice=='Y');
    }
}