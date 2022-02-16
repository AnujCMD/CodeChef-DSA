import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int count=0;
            int temp = n;
            
            while(temp!=0){
                int i=1;    
                temp = (int) (temp/Math.pow(5, i));
                //System.out.println(temp+" "+count);
                i= i+1;    
                count++;   
                //temp =n;
            }
            //System.out.println("END of Case");
            //System.out.println(temp+" "+count);
            temp = n;
            int ans = 0;
            int counta=0;
            //System.out.println(temp);
            for(int j=1; j<=count;j++){
                
                ans =(int) ( temp/Math.pow(5, j));
                counta = counta + ans;
                //System.out.print(counta+" ");
            }
            System.out.println(counta);
        }
    }
}