package Cards;

import java.util.Scanner;

public class Substring{
	public static String longestPalindrome(String S){
         String m="";
        for(int i=0;i<S.length();i++){
           String odd=value(S,i,i);
            String even=value(S,i,i+1);
            if(odd.length()>even.length()&&odd.length()>m.length())
            m=odd;
            else if(odd.length()<even.length()&&even.length()>m.length())
            m=even;
           
        }
        return m;
    }
	
	public static String value(String s,int i,int j){
	       String ans="";
	        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
	        {
	            i--;j++;
	            
	        }
	       ans=s.substring(i+1,j);
	       return ans;
	    }
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s=sc.nextLine();
		String ans=longestPalindrome(s);
		
		System.out.println("Longest Pallindrome Substring is :"+ans);
	}
}