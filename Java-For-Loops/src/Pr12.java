public class Pr12 {
    public static void main(String[] args) {
        int number1, number2, number3;
        for(int i=1;i<=500;i++){
           int temp=i;
           number1= temp%10;

           temp= temp/10;
           number2= temp%10;

           temp=temp/10;
           number3=temp%10;

           if((Math.pow(number1,3)+ Math.pow(number2,3)+Math.pow(number3,3))==i){
               System.out.println(i);
           }
        }
    }
}