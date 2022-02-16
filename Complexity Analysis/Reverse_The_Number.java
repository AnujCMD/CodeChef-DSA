import java.util.*;
public class Reverse_The_Number{
    public static int rev(int n){
        if(n%10==n){
            return n;
        }
        int net = n;
        net = dig(net)-1;
        net= (int)(Math.pow(10, net));
        return rev(n/10)+n%10*net; // 1234 >> 123*10+4 NOT cool>> rev(123)+4*
    }
    public static int dig(int net){
        if(net%10==net){
            return 1;
        }
        return dig(net/10)+1; // 1234>> 123>>12>>1
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            System.out.println(rev(n));
        }
    }
}