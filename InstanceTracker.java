//7. Create an application program to track and display the number of instances of the class
//created, destroyed and live during the program execution
public class InstanceTracker {
    //static int c;
    static  int createdCounter = 0;
    static int liveCounter = 0;

    InstanceTracker()
    {
     //   c++;
        createdCounter++;
        liveCounter++;



    }

    public static void main(String[] args) throws InterruptedException{

        InstanceTracker t1=new InstanceTracker();
        t1=null;
        InstanceTracker t2=new InstanceTracker();
        t2=t1;
        InstanceTracker t3 =new InstanceTracker();

       InstanceTracker t4=new InstanceTracker();
        System.out.println("total objects created:" +liveCounter);

        Runtime.getRuntime().gc();

        System.out.println(String.format("Instances created: %d", createdCounter));
       System.out.println(String.format("Instances live: %d", liveCounter));
        System.out.println(String.format("Instances destroyed: %d", (createdCounter-liveCounter)));
    }
    protected void finalize() throws Throwable
    {


        liveCounter--;


    }

}
