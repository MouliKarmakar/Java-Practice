public class Pr7 {
    public static void main(String[] args) {
        String str="mountain";
        String newstr="";
        for(int i=str.length()-1;i>=0;i--){
            newstr=newstr+str.charAt(i);
        }

        if(str.equals(newstr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}