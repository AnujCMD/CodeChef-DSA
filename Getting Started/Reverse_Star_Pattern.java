import java.util.*;
public class Reverse_Star_Pattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String str = " ";
        String str1 = "*";
        int net=n-1;
        for(int i=0;i<=n+1; i++){
            for(int j=0;j<n;j++)
            {
                if(j>=n-i+1){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}