public class Pr5 {
    public static void main(String[] args) {
        String str= "Masai School";
        StringBuilder newstr= new StringBuilder(str);
        int vowels=0;
        for(int i=0;i<str.length();i++){
            char ch=newstr.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
        }
        if(vowels>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}