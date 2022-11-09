//2. Create class OneBHK with instance variable roomArea, hallArea and price
//        a. Create a default and parameterized constructor;
//        b. Method show(): to print OneBHK data member information;
//        Create another class TwoBHK which has all the properties and behaviour of OneBHK and a
//new instance variable room2Area.
//        a. Create a default and parameterized constructors;
//        b. Method show(): to print all data member information;
import java.util.Scanner;

public class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    OneBHK() {
        roomArea=0;
        hallArea=0;
        price=0;
    }

        OneBHK( double roomArea, double hallArea, double price)

        {
            this.roomArea = roomArea;
            this.hallArea = hallArea;
            this.price = price;


        }
        void show ()
        {
            System.out.println("your room area is" + "\t" + roomArea + "\n" + "your hallarea is"+"\t" + hallArea + "\n" + "the estimated price is" + "\t" + price);

        }

    }

class TwoBHK extends OneBHK
{   static double room2Area;
    static double totalAmount=0;
    TwoBHK(double roomArea,double hallArea,double price,double room2Area)
    {super(roomArea,hallArea,price);


        this.room2Area=room2Area;

        totalAmount += price;

    }
    void show1()
    { super.show();
        System.out.println("room2Area is: "+room2Area);
    }
}
class Driverclass2
{
    public static void main(String[] args) {
        System.out.println("welcome to OneBHK Services");
        System.out.println("please enter flat1 roomArea,hall Area price and room2Area-");
        Scanner s1= new Scanner(System.in);
        TwoBHK b1=new TwoBHK(s1.nextDouble(),s1.nextDouble(),s1.nextDouble(),s1.nextDouble());
         b1.show1();
         System.out.println("please enter flat2 roomArea,hall Area price and room2Area");
        Scanner s2= new Scanner(System.in);
        TwoBHK b2=new TwoBHK(s2.nextDouble(),s2.nextDouble(),s2.nextDouble(),s2.nextDouble());
        b2.show1();
        System.out.println("*******************************");
        System.out.println(String.format("Total amount for all flats: %.2f", TwoBHK.totalAmount));



    }
}

