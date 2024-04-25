package Cards;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private int age;
    private int salary;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}


public class EmployeeSystem {
    
    public static void addEmployee(ArrayList<Employee> employees,Scanner sc)
    {
          Employee e=new Employee();
          System.out.println("Enter employee ID: ");
          int id=sc.nextInt();
          e.setId(id);
           sc.nextLine();
          System.out.println("Enter Employee Name");
          String name=sc.nextLine();
          e.setName(name);

          
          System.out.println("Enter employee age: ");
          int age=sc.nextInt();
          e.setAge(age);

          
          System.out.println("Enter employee Salary: ");
          int salary=sc.nextInt();
          e.setSalary(salary);

          employees.add(e);

          
    }

    public static void displayEmployee(ArrayList<Employee> employees)
    {
        System.out.println("-- Report --");
        for(Employee e:employees)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary());
        }
        System.out.println("--End Of  Report --");
    }
    
    
    public static void main(String[] args) {
        
      ArrayList<Employee> employees=new ArrayList<>();
    
    Scanner sc =new Scanner(System.in);
    
    boolean fg=true;
    while(fg)
    {
    	System.out.println("Main Menu \n 1.Display all Employee \n 2.Add Employee \n 3. Exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                displayEmployee(employees);
                break;
            case 2:
                addEmployee(employees,sc);
                break;
            case 3:
            	fg=false;
            	break;
                
        }
        
    }
    

}

}

