import java.util.*;
public class Valid_Triangle_Or_Not{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("YES");
        }
        else 
        System.out.println("NO");
    }

}