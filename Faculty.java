//1. Create three classes.
//        Faculty (facultyid, salary)
//        FullTimeFaculty (basic, allowance) inherits the class Faculty
//PartTimeFaculty (hour, rate) inherits the class Faculty
//Create a method for accepting input in FullTimeFaculty and PartTimeFaculty, but salary should
//        not be accepted. Salary is calculated on the basis of (basic+allowance) for FullTimeFaculty
//        and (hour*rate) for PartTimeFaculty. Also, create a method in the above classes to display
//        faculty data.
//        Create another class (say DriverClass) for the main method and store 2 full-time and 2 parttime faculty information. Also, print their details.
import java.util.Scanner;

public class Faculty
{
int facultyid;
float salary,salary1;


}
class FullTimeFaculty extends Faculty
{
    float basic ;
    float allowance;
    FullTimeFaculty(float basic,float allowance){
        this.basic=basic;
        this.allowance=allowance;
        salary=basic+allowance;


    }
    void display1()
    {
        System.out.println("salary for regular employees is"+"\t"+salary);
    }

}
class PartTimeFaculty extends Faculty
{
    float hour;
    float rate;

    PartTimeFaculty(float hour,float rate){
        this.hour=hour;
        this.rate=rate;
        salary1=rate*hour;

    }
    void display2()
    {
        System.out.println("salary for parttime faculties is"+"\t"+salary1);
    }

}
class Driverclass
{
    public static void main(String[] args)
    {
        System.out.println("welcome to faculty portal");
        System.out.println("please enter the following details");
        System.out.println();
        System.out.println("regular faculties please enter basic salary and allowances");
        Scanner sc1=new Scanner(System.in);
        FullTimeFaculty f1=new FullTimeFaculty(sc1.nextFloat(), sc1.nextFloat());
        System.out.println("part time faculties please enter the time(hrs) and rate(rupees)");
        Scanner sc2=new Scanner(System.in);
        PartTimeFaculty f2=new PartTimeFaculty(sc2.nextFloat(),sc2.nextFloat() );
        f1.display1();
        f2.display2();


    }
}





