public class Pr1 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder newstr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(newstr.charAt(i));
        }
    }
}