public class Pr2 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder newstr=new StringBuilder(str);
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(newstr.charAt(i));
        }
    }
}