import java.util.*;
public class Main4 {
	static List<Integer> l1=new ArrayList<Integer>();
	static boolean isPalindrome(int x)
	{
		int temp=x,sum=0;
		while(x>0)
		{
			int r=x%10;
			sum=sum*10+r;
			x=x/10;
		}
		if(sum==temp) return true;
		return false;
	}
public static void main(String[] args) {
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(),m=sc.nextInt();
		int sum=0;
		for(int i=x;i<m;i++)
		{
			if(isPalindrome(i))
			{
				l1.add(i);
				sum=sum+i;
			}
		}
		System.out.println(l1);
		System.out.println(sum);
	}
}
}