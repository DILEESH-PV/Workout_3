package p1;
public class Faculty
{
    int fid;
    String name;
    public Faculty()
    {
        fid=0;
        name=null;
    }
    public Faculty(int facultyID,String name)
    {
        this.fid=facultyID;
        this.name=name;
    }
    public void showfaculty()
    {
        System.out.println("Faculty in package p1");
        System.out.println("Name       :"+name);
        System.out.println("Faculty ID :"+fid);
    }
}
