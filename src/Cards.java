

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Cards {

    public static void addCards(HashMap<Character,ArrayList<Integer>> cards,char s,int number)
    {
            if(cards.containsKey(s))
            {
            cards.get(s).add(number);
            }
            else
            {
                cards.put(s,new ArrayList<Integer>());
                cards.get(s).add(number);
               
            }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    HashMap<Character,ArrayList<Integer>> cards=new HashMap<>();
    System.out.println("Enter Number Of cards: ");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        System.out.println("Enter card "+i+" : ");
        char s=sc.next().charAt(0);
        int number=sc.nextInt();
         addCards( cards,s,number);
     }


       Set<Character> keySet = cards.keySet();
       System.out.println(" \nDistinct symbols are :");
      for(Character c : keySet)
      {
        System.out.print(c+" ");
      }

      System.out.println("\n\n ");


      int sum;
      for(Character c : keySet)
      {
         sum=0;
        System.out.println("Cards in symbol : " + c);
        for(int num:cards.get(c)){
           System.out.println(c+"  "+num);
            sum+=num;
          }
          System.out.println("Number of cards : "+cards.get(c).size());
           System.out.println("Sum of Numbers : "+sum+"\n");
      }
      
   
    }
}

