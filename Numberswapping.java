//8. Write a program to swap the value of two numbers by call by value and call by reference  methods

import java.util.Scanner;


class Wrapper {
    int value;
    Wrapper(int value) {
        this.value = value;
    }
}

class NumberSwapping {
    static int a,b,c;
    //Method to swap number using call by value.
    static void callByValue(int a, int b) {
        System.out.println("before swapping the value of "+"a="+a +"\t"+"and "+ "b="+b );

        c= a;
        a = b;
        b = c;

        System.out.println("Call by Value");
        System.out.println("After swapping the value of "+"a="+a +"\t"+"and "+ "b="+b );
        System.out.println("");
    }

    static void callByReference(Wrapper w1, Wrapper w2) {
        System.out.println("before swapping the value of "+"a="+w1.value+"\t" +"and "+ "b="+w2.value );
        int temp = w1.value;
        w1.value = w2.value;
        w2.value = temp;

        System.out.println("Call by Reference");
        System.out.println("After swapping the value of "+"a="+w1.value+"\t" +"and "+ "b="+w2.value );
        System.out.println("");
    }

    public static void main(String[] args) {

        System.out.println("enter  two numbers to swap by call by value");
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
        b=sc.nextInt();
        callByValue(a,b);
        System.out.println("enter two numbers you want to swap by call by refernce");
        Scanner sc2=new Scanner(System.in);
        Wrapper w1 = new Wrapper(sc2.nextInt());
        Wrapper w2 = new Wrapper(sc2.nextInt());
        callByReference(w1, w2);
    }
}