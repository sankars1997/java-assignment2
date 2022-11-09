//4. Create a class Medicine to represent a drug manufactured by a pharmaceutical company.
//        Provide a function displayLabel() in this class to print the Name and address of the company.
//        Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
//        displayLabel() function in each of these classes to print additional information suitable to the
//        type of medicine. For example, in the case of tablets, it could be “store in a cool dry place”, in
//        the case of ointments it could be “for external use only” etc.
//        Create a class TestMedicine and include the main function to do the following:
//        Create three Medicine objects of the type as decided by a randomly generated integer in the
//        range 1 to 3.
//        Refer to Java API Documentation to find out the random generation feature.
//        Check the polymorphic behavior of the displayLabel() method.
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Medicine {
    public void displayLabel()
    {
        System.out.println("minarva pharma limited");
        System.out.println("newdelhi 68851");
    }
}
class Syrup extends Medicine{
    public void displayLabel()
    {
        //System.out.println("minarva pharma limited");
        //System.out.println("newdelhi 68851");
        System.out.println("produces only high quality syrups");
    }

}
class Ointment extends Medicine
{
    public void displayLabel()
    {
        //System.out.println("minarva pharma limited");
        //System.out.println("newdelhi 68851");
        System.out.println("always keep oinment out of children");
    }
}
class Tablet extends Medicine
{
    public void displayLabel()
    {
        //System.out.println("minarva pharma limited");
       // System.out.println("newdelhi 68851");
        System.out.println("always store medicines in a cool place");
    }

}
class TestMedicine

{

    public static void main(String[] args) {


        int randno= ThreadLocalRandom.current().nextInt(0,4);

        if(randno == 1) {
            Medicine medicine = new Medicine();
            Tablet tablet = new Tablet();
            medicine.displayLabel();
            tablet.displayLabel();
        }
        else if(randno == 2) {
            Medicine medicine = new Medicine();
            Syrup syrup = new Syrup();
            medicine.displayLabel();
            syrup.displayLabel();
        }
        else if(randno == 3) {
            Medicine medicine = new Medicine();
            Ointment ointment = new Ointment();
            medicine.displayLabel();
            ointment.displayLabel();
        }
        else {
            System.out.println("Invalid Choice");
        }
       }
    }




