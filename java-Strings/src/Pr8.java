public class Pr8 {
    public static void main(String[] args) {
        String str="mountain";
        String vowels="";
        String consonants="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels=vowels+str.charAt(i);
            }
            else{
                consonants=consonants+str.charAt(i);
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);

    }
}