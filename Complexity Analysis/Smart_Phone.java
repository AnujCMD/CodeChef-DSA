import java.util.*;
public class Smart_Phone{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr= new long[t];
        for(int i=0; i<t; i++){
            arr[i] = sc.nextLong();
        }
        /*for(long i=0; i<t; i++){
            //arr[i] = sc.nextLong();
          System.out.print(arr[i]+" ");
        }*/
        System.out.println();
        long temp=0;
        long rev=0;
        Arrays.sort(arr);
       // for(long i=0; i<t; i++){
            //arr[i] = sc.nextLong();
       //   System.out.print("This is"+i+" "+arr[i]+" ");
        //  System.out.println("This is the end");
        //}
       // System.out.println("This is the START");
        for(int i=0; i<t; i++){
            rev = Math.max(arr[i]*(t-i), rev);
           // System.out.println(rev+" ");
        }
System.out.println(rev);

    }
}