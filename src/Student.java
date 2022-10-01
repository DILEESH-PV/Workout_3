
package p1;
public class Student
{
    int regno;
    String name;
    public Student()
    {
        regno=0;
        name=null;
    }
    public Student(int regno,String name)
    {
        this.regno=regno;
        this.name=name;
    }
    public void showstudent()
    {
        System.out.println("\nStudent in package p1");
        System.out.println("Name   :"+name);
        System.out.println("Reg No :"+regno);
    }
}