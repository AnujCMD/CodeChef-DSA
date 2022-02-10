import java.util.*;
public class Find_Me{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k= sc.nextInt();
        int res= -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
            if(arr[i]==k){
                res = 1;
                System.out.println(res);
                break;
            }
        }
        if(res==-1)
        System.out.println(res);

    }
}