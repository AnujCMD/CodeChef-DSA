import java.util.*;
public class Coin_Flip{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int r = sc.nextInt();
            while(r-->0){
            int hort= sc.nextInt();
            int n= sc.nextInt();
            int torh= sc.nextInt();
            if(n%2==0){
                System.out.println(n/2);
            }
            else{
                if(hort == torh){
                    System.out.println((n-1)/2);
                }
                else
                System.out.println((n+1)/2);
            }
        }
    }
    }
}