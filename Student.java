
package p2;

import java.util.Scanner;

public class Student
{
    int regno;
    String name;
    Scanner sc=new Scanner(System.in);
    public void readstudent()
    {
        System.out.println("Enter student name");
        name= sc.next();
        System.out.println("Enter the register number");
        regno= sc.nextInt();

    }
    public void showstudent()
    {
        System.out.println("Student in package p2");
        System.out.println("Name   :"+name);
        System.out.println("Reg No :"+regno);
    }
}