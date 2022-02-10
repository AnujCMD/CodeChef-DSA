import java.util.*;
public class Buy_Please{
    public static void main(String[] args){
        int a,b,x,y;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        int total =0;
        total = (a*x)+(b*y);
        System.out.print(total);
    }
}