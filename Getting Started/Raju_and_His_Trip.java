import java.util.*;
public class Raju_and_His_Trip{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n= sc.nextInt();
        if(n%6==0 || n%5==0){
            System.out.print("YES");
        }
        else
        System.out.print("NO");
    }
}