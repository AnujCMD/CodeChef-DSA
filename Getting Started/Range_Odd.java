import java.util.*;
public class Range_Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l=  sc.nextInt();
        int r= sc.nextInt();
        for(int i=l; i<=r; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}