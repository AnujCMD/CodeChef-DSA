import java.util.*;
public class Carvans{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(n==1){
                System.out.println(1);
            }
            else{
            int count = 1;
            int max=  arr[0];
            for(int i =1; i<n;i++){
                if(arr[i]<=max){
                    count++;
                    max=arr[i];}
                }
            System.out.println(count);
        }
    }
    }
}