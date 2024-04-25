import java.util.*;
 public class Employee {
 public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 char empDes;
 int pos = Integer.MIN_VALUE, da=0, salary;
 String desg = null;
 System.out.println("Enter the number of employees yot want to add");
 int m = sc.nextInt();
 String[] EmpNo = new String[m];
 String[] EmpName = new String[m];
 String[] JoinDate = new String[m];
 String[] Department = new String[m];
 int[] Basic = new int[m];
 int[] HRA = new int[m];
 int[] IT = new int[m];
 char[] DesigCode = new char[m];
 for (int i = 0 ; i<m ; i++)
 {
    System.out.println("Enter the DATA of Employee "+ (i+1)+": ");
    EmpNo[i] = sc.next();
    EmpName[i] = sc.next();
    JoinDate[i] = sc.next();
    DesigCode[i] = sc.next().charAt(0);
    Department[i] = sc.next();
    Basic[i] = sc.nextInt();
    HRA[i] = sc.nextInt();
     IT[i] = sc.nextInt();
 }
 System.out.println("Enter the employee you want to search");
 String search = sc.next();
 for(int i=0;i<(EmpNo.length);i++)
 {
 if(search.equals(EmpNo[i]))
 {
 pos=i;
 break;
 }
 }
 if(pos==Integer.MIN_VALUE)
 {
 System.out.println("Employee id does not exist");
 return;
 }
 empDes=DesigCode[pos];
 switch(empDes)
 {
      case 'e':
            desg="Engineer";
            da=20000;
             break;
     case 'c':
        desg="Consultants";
         da=32000;
          break;
      case 'k':
          desg="Clerk";
           da=12000;
           break;
      case 'r':
      desg="Receptionist";
         da=15000;
        break;
    case 'm':
       desg="Manager";
        da=40000;
          break;
 }
 salary=Basic[pos]+HRA[pos]+da-IT[pos];
 System.out.println("Emp no.\t\tEmployeeName.\t\tDepartment\t\tDesignation\t\tSalary");
System.out.println(EmpNo[pos]+"\t\t\t"+EmpName[pos]+"\t\t\t"+Department[pos]+"\t\t\t"+desg+"\t\t\t"+salary);
 }
 }
