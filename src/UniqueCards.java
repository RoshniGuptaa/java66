

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Card{
	char symbol;
	int number;
	
	Card(char symbol,int number)
	{
		this.symbol=symbol;
		this.number=number;
	}
}

public class UniqueCards {
	
	
	
	 
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
    ArrayList<Card> cd=new ArrayList<>();
    HashSet<Character> cards=new HashSet<> () ;
    
    System.out.println("Enter Number Of cards: ");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        System.out.println("Enter card "+i+" : ");
        char s=sc.next().charAt(0);
        int number=sc.nextInt();
           Card ch=new Card(s,number);
           if(cards.add(ch.symbol))
           {
        	   cd.add(ch);
           }
     }

      Collections.sort(cd,(cd1,cd2)->Character.compare(cd1.symbol, cd2.symbol));

      System.out.println("\n"+cards.size()+" symbols gathered in "+n+" cards .");
       System.out.println(" \nCards in Set are :");
      for( Card c : cd)
      {
        System.out.println(c.symbol+" "+c.number);
      }

      System.out.println("\n\n ");


      
      
   
    }

}
