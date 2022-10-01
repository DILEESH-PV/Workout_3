package p2;

import java.util.Scanner;

public class Faculty
{
    int facid;
    String name;
    Scanner sc=new Scanner(System.in);
    public void readfaculty()
    {
        System.out.println("Enter faculty name");
        name= sc.next();
        System.out.println("Enter the faculty id");
        facid= sc.nextInt();

    }
    public void showfaculty()
    {
        System.out.println("faculty in package p2");
        System.out.println("Name       :"+name);
        System.out.println("Faculty ID :"+facid);
    }
}