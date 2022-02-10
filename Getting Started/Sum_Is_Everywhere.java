import java.util.*;
public class Sum_Is_Everywhere{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count_odd=0, count_even=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                count_even+=i;
            }
            else{
                count_odd+=i;
            }
        }
        System.out.println(count_odd+" "+count_even);
    }
}