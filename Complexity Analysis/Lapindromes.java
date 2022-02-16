import java.util.*;
public class Lapindromes{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s= sc.next();
            int n= s.length();
            String s2;
            int count=0;
            String s1= s.substring(0, n/2);
            if(n%2==0){
             s2=s.substring(n/2, n);
            }
            else
            s2= s.substring((n/2)+1, n);
            char ch2[] = s2.toCharArray();
        char ch1[] = s1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0; i<n/2;i++){
            if(ch1[i]==ch2[i]){
                count++;
            }
        }
        if(count==n/2){
            System.out.println("YES");
        }
        else 
        System.out.println("NO");
    }
}
}