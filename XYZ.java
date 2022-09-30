import java.util.Scanner;
class Faculty
{
    int fid;
    float salary;
}
class FulltimeFaculty extends Faculty
{
    float basic,allowence;

    FulltimeFaculty(float basic,float allowence)
    {
        this.basic=basic;
        this.allowence=allowence;
    }

    float FulltimeSalary()
    {
        float salary1;
        salary1=basic+allowence;
        return salary1;
    }

    void Fullshow()
    {
        System.out.println("Fulltime Salary = "+FulltimeSalary());
    }
}
class ParttimeFaculty extends Faculty
{
    int hour;
    float rate;
    ParttimeFaculty(int hour,float rate)
    {
        this.hour=hour;
        this.rate=rate;
    }
    float Parttimesalary()
    {
        float salary2;
        salary2=(hour*rate);
        return salary2;
    }
    void Partshow()
    {
        System.out.println("Parttime Salary = "+Parttimesalary());
    }
}

class XYZ
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic salary and Allowance");
        float b= scanner.nextFloat();
        float h= scanner.nextFloat();
        System.out.println("Enter the total taken hour and rate per hour");
        int hr= scanner.nextInt();
        float rt= scanner.nextFloat();
        FulltimeFaculty S1 = new FulltimeFaculty(b,h);
        ParttimeFaculty S2 = new ParttimeFaculty(hr,rt);
        S1.Fullshow();
        S2.Partshow();

    }
}
