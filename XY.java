import java.util.Scanner;

class Student
       {
            int rno;
            float per;
           Student()
             {
               rno=0;
               per=0;
             }
           Student(int rollno, float percentage)
            {
             this.rno=rollno;
              this.per=percentage;
            }
          void show()
            {
              System.out.println("\nRoll Number  : "+rno+"\nPercentage: "+per);
            }
       }
class ClgStudent extends Student
       {
          String sem;
          ClgStudent()
           {
             sem=null;
             rno=0;
             per=0;
           }
          ClgStudent( int rollno, float percentage, String semester)
          {
             this.rno=rollno;
             this.per=percentage;
             this.sem=semester;
          }
         void show()
         {
            System.out.println("\n   ROLL NO     :  "+rno);
            System.out.println("   Percentage  :  "+per);
            System.out.println("   Semester    :  "+sem);
            System.out.println("______________________________________________________");
          }
}
class SclStudent extends Student
     {
        String cname;
        SclStudent()
         {
           rno=0;
           per=0;
           cname=null;
         }
       SclStudent(int rollno, float percentage,String classname)
        {
          this.rno=rollno;
          this.per=percentage;
          this.cname=classname;
        }
      void show()
      {
         System.out.println("\n   ROLL NO       : "+rno);
         System.out.println("   Percentage    : "+per);
         System.out.println("   Standard      : "+cname);
         System.out.println("______________________________________________________");
        }
}

class XY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ClgStudent[] cs = new ClgStudent[2];
        SclStudent[] ss = new SclStudent[3];
        cs[0] = new ClgStudent(1011, 72, "3rd");
        cs[1] = new ClgStudent(1015, 79, "6th");

        ss[0] = new SclStudent(346, 73, "7th");
        ss[1] = new SclStudent(348, 81, "8th");
        ss[2] = new SclStudent(366, 97, "10th");
        System.out.println("\n Detailes are stored");
        for (int i = 0; i < ss.length; i++) {
            ss[i].show();
        }
        for (int i = 0; i < cs.length; i++) {
            cs[i].show();
        }
        System.out.println("\nA Grade student list");
        int count = 0;
        System.out.println("\nCollege Wise\n----------------------------------------\n");
        for (int j = 0; j < cs.length; j++)
        {
            if (cs[j].per > 75)
            {
                System.out.println(" ROLL NO : " + cs[j].rno + "  has Percentage : " + cs[j].per + " in " + cs[j].sem + " semester with A grade");
                count++;
            }
        }
        System.out.println("\nSchool Wise\n-----------------------------------------\n");
        for (int j = 0; j < ss.length; j++) {
            if (ss[j].per > 75) {
                System.out.println(" ROLL NO : " + ss[j].rno + "  has Percentage : " + ss[j].per + " in " + ss[j].cname + " standard with A grade");
                count++;
            }
        }
        System.out.println("\n There are " + count + " Students got A grade in school and college ");
        int c = 0;
        System.out.println("Enter the Roll number that you want to search the student in the school list or college list");
        int cr = sc.nextInt();
        for (int i = 0; i < ss.length; i++)
        {
            if (cr == ss[i].rno)
            {
                System.out.println("\n This is School student Roll No : " + ss[i].rno + " Percentage : " + ss[i].per + " in " + ss[i].cname + " standard ");
                c++;
            }
        }
        for (int i = 0; i < cs.length; i++)
        {
            if (cr == cs[i].rno)
            {
                System.out.println("\n This is College student Roll No : " + cs[i].rno + " Percentage : " + cs[i].per + " in " + cs[i].sem + " semester ");
                c++;
            }
        if(c==0)
        {
            System.out.println("\nRoll Number is not present in record");
        }
        }
    }
}