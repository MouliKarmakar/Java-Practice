public class Pr3 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder newstr=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                System.out.println(newstr.charAt(i));
            }
        }
    }
}