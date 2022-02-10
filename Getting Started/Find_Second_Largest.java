import java.util.*;
public class Find_Second_Largest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int min_x,min_y, maxi;
        min_x= Math.min(a,b);
        min_y= Math.min(b,c);
        maxi= Math.max(min_x,min_y);
        System.out.print(maxi);
    }

}