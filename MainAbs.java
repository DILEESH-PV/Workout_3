abstract class Car
{
    int NoofWheels;
    abstract void ignition();
    /*{
        System.out.println("working on the car class and display Please switch on the ignition");
    }*/
    void ChangeGear()
    {
        System.out.println("display the contents in the ChangeGear() in the class car");
    }
}
class Sedan extends Car
{
    void ignition()
    {
        System.out.println("content inthe sedan class swich on the ignition on your car");
    }
    void ChangeGear()
    {
        System.out.println("display the contents in the ChangeGear() in the class sedan");
    }
}

public class MainAbs
{
    public static void main(String[] args)
    {
       Car ob = new Sedan();
       ob.ChangeGear();
       ob.ignition();


    }
}
