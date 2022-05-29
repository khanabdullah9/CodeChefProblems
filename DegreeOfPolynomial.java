import java.util.*;
public class DegreeOfPolynomial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();//number of test cases
		for(int t=1;t<=T;t++)
		{
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    for(int x = 0;x<=arr.length-1;x++)
		    {
		        arr[x] = sc.nextInt();
		    }
		    int highest = 0;//highest degree of polynomial
		    for(int a = arr.length-1;a>=0;a--)
		    {
		        if(arr[a]!=0)
		        {
		            highest = a;
		            break;
		        }
		    }
		    System.out.println(highest);
		}
	}
}