public class Pr9 {
    public static void main(String[] args) {

        int[]arr={1,2,3,7,4,8};
        if(arr[0]>arr[1]){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }

        for(int i=1;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.print(2+" ");
            }
            else if(arr[i]>arr[i+1]||arr[i]>arr[i-1]){
                System.out.print(1+" ");
            }
            else{
                System.out.print(0+" ");
            }
        }

        if(arr[arr.length-1]>arr[arr.length-2]){
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
        }
        System.out.println();
    }
}