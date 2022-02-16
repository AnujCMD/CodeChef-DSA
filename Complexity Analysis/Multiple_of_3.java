import java.util.*;
import java.lang.*;
import java.io.*;
public class Multiple_of_3
{
	public static void solve(long k,int d0,int d1){
        StringBuffer sb=new StringBuffer(""+d0+d1);
        long sum=d1+d0;

        if(k>=3){
            if(sum%5!=0){
                sum=sum+(sum%10);
                for(long i=(k-3)%4;i>0;i--){
                    sum=sum+(sum%10);
                }
                sum=sum+((k-3)/4)*20;
            }else {
                System.out.println("NO");
                return;
            }
        }

        if(sum%3==0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
           int d0,d1;
           long k;
           k=sc.nextLong();
           d0=sc.nextInt();
           d1=sc.nextInt();
           solve(k,d0,d1);
        }
    }
}