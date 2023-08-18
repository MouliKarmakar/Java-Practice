public class Pr7 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder newstr= new StringBuilder(str);
        StringBuilder rev= new StringBuilder(newstr.reverse());

        String reverse=rev.toString();
        if(str.equals(reverse)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}