import java.util.LinkedList;
import java.util.Scanner;

public class JavaArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> myList = new LinkedList<>();
          boolean fg=true;
        while(fg){
            System.out.println("----------MENU----------");
            System.out.println("1. Add Element");
            System.out.println("2. Search Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Display Element");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int key = sc.nextInt();
            System.out.println();
            switch(key)
            {
               case 1:
                System.out.print("Enter a number ");
                int num= sc.nextInt();
                myList.add(num);
                System.out.println(num+" is inserted");
                System.out.println("\n");
                break;
            
            case 2:
                System.out.print("Enter number to be searched: ");
                int s = sc.nextInt();
                int i=0;
                for(int num2 : myList){
                    if(s==num2){
                        System.out.println(s + " is at position " + i);
                    }
                    i++;
                }
                System.out.println("\n");
                break;
            
            case 3:
                System.out.print("Enter number to be deleted ");
                int st = sc.nextInt();
                int j=0,ind=0;
                for(int num2 : myList){
                    if(st==num2){
                        ind=j;
                    }
                    j++;
                }
                myList.remove(ind);
                System.out.println(st+"is deleted");
                System.out.println("\n");
                break;
            
            case 4:
                System.out.println("numbers  in the list are: ");
                for(int str : myList){
                    System.out.print(str + "\t");
                }   
                System.out.println("\n");
                 break;
            case 5:
              fg=false;
               break;
            } 
        }
        sc.close();
    }
}
