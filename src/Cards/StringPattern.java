package Cards;

import java.util.Scanner;

public class StringPattern {

	public static String stringpattern(String s){
		
		int count=1;
		String ans="";
		int i=1;
		while(i<s.length())
		{
			if(s.charAt(i-1)==s.charAt(i))
			{
				count++;
			}
			else {
				if(count>1)
				ans=ans+s.charAt(i-1)+String.valueOf(count);
				else
					ans=ans+s.charAt(i-1);
				count=1;
				
			}
			i++;
			
		}
		ans=ans+s.charAt(i-1)+(count>1?String.valueOf(count):"");
		return ans;
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String ans=stringpattern("aaxxyzapple");
		System.out.println(ans);
	}
}
