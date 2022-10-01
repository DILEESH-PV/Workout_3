import p1.*;
class Demo
{
    public static void main(String[] args)
    {
        p1.Student st1=new Student(1601,"Shyam");
        p1.Faculty fc1=new Faculty(5001,"Manoj");
        st1.showstudent();
		System.out.println("-------------------------------");
        fc1.showfaculty();
		System.out.println("-------------------------------");
       p2.Student st2=new p2.Student();
        p2.Faculty fc2=new p2.Faculty();
        st2.readstudent();
        fc2.readfaculty();
		System.out.println("-------------------------------");
       st2.showstudent();
	   System.out.println("-------------------------------");
        fc2.showfaculty();
    }
}