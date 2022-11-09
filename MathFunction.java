//3. Create a class MathFunction containing the method ‘multiply’ to calculate the multiplication
//        of the following arguments.
//         two integers
//         two floats
//         one float and one integer
import java.util.Scanner;

public class MathFunction {
    void Multiply(int a,int b)
    {

      int multi=a*b;
      //return int multi;
      System.out.println("the product is "+multi);
    }

   void Multiply(float a,float b)
    {

      float multi=a*b;
        System.out.println("the product is "+multi);
    }
  void  Multiply(int a,float b)
    {

      float multi=a*b;
        System.out.println("the product is "+multi);
    }
    public static void main(String[] args) {
        MathFunction f1=new MathFunction();
        System.out.println("enter two integer no");
        Scanner sc1=new Scanner(System.in);
        f1.Multiply(sc1.nextInt(), sc1.nextInt());
        System.out.println("enter two float  no");
        f1.Multiply(sc1.nextFloat(), sc1.nextFloat());
        System.out.println("enter one integer and float  no");
        f1.Multiply(sc1.nextInt(), sc1.nextFloat());


    }


    }






