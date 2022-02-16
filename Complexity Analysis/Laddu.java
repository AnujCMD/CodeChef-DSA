import java.util.*;
import java.lang.*;
import java.io.*;
public class Laddu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int a = sc.nextInt();
		    String origin = sc.next();
		    int total=0;
		    for(int i=0;i<a;i++)
		    {
		        String act = sc.next();
		        if(act.equals("TOP_CONTRIBUTOR"))
		        {
		            total+=300;
		        }
		        else if(act.equals("CONTEST_WON"))
		        {
		            int r = sc.nextInt();
		            total+=300;
		            if(r<20)
		            total+=(20-r);
		        }
		        else if(act.equals("BUG_FOUND"))
		        {
		            int p =sc.nextInt();
		            total+=p;
		        }
		        else{
		            total+=50;
		        }
		    }
		    if(origin.equals("INDIAN"))
		    System.out.println(total/200);
		    else
		    System.out.println(total/400);
		   t--;
		}
	}
}