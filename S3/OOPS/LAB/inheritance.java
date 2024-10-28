import java.util.*;
class Employee
{
   String name, address, phonenumber;
   int age;
   double salary;

   public void printSalary()
   {
     System.out.println("Salary: " + salary);
   }
}
 
class Officer extends Employee
{
   String specialization;
}

class Manager extends Employee
{
   String department;
}

public class inheritance
{
   public static void main(String args[])
   {
    Scanner s = new Scanner(System.in);
    
    Officer officer = new Officer();
    System.out.println("Enter the details of the officer:");
    System.out.println("Name: ");
    officer.name = s.nextLine();
    System.out.println("Age: ");
    officer.age = s.nextInt();
    s.nextLine(); // Consume the leftover newline
    System.out.println("Phone Number: ");
    officer.phonenumber = s.nextLine();
    System.out.println("Address: ");
    officer.address = s.nextLine();
    System.out.println("Salary: ");
    officer.salary = s.nextDouble();
    s.nextLine(); // Consume the leftover newline
    System.out.println("Specialization: ");
    officer.specialization = s.nextLine();
    
    // Printing officer details
    System.out.println("\nOfficer Details: ");
    System.out.println("Name: " + officer.name);
    System.out.println("Age: " + officer.age);
    System.out.println("Phone Number: " + officer.phonenumber);
    System.out.println("Address: " + officer.address);
    System.out.println("Salary: " + officer.salary);
    System.out.println("Specialization: " + officer.specialization);
    s.nextLine();

    Manager manager = new Manager();
    System.out.println("Enter manager details:");
    System.out.println("Name: ");
    manager.name = s.nextLine();
    System.out.println("Age: ");
    manager.age = s.nextInt();
    s.nextLine(); // Consume the leftover newline
    System.out.println("Phone Number: ");
    manager.phonenumber = s.nextLine();
    System.out.println("Address: ");
    manager.address = s.nextLine();
    System.out.println("Salary: ");
    manager.salary = s.nextDouble();
    s.nextLine(); // Consume the leftover newline
    System.out.println("Department: ");
    manager.department = s.nextLine();
    
    // Printing manager details
    System.out.println("\nManager Details: ");
    System.out.println("Name: " + manager.name);
    System.out.println("Age: " + manager.age);
    System.out.println("Phone Number: " + manager.phonenumber);
    System.out.println("Address: " + manager.address);
    System.out.println("Salary: " + manager.salary);
    System.out.println("Department: " + manager.department);

    s.close();
   }
}
    
