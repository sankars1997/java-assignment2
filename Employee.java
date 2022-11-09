//6. Create a class Employee with fields Name, Emp ID, result and three assessment values (ass1,
//        ass2 and ass3 (0-100)). If all the assessment values of the employee are above 75, then the
//        result variable should be updated as "Promoted" else "Demoted". Also, calculate and display
//        the total and percentage of the employee using functions.
import java.util.Scanner;

public class Employee {
    String name;
    int empId;
    String result;
    int ass1, ass2, ass3;

    public Employee( String name,int empId,int ass1,int ass2,int ass3) {


        this.name =  name;
        this.empId = empId;
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.ass3 = ass3;
        //checks whether to promote or demote.
        if(ass1>75 & ass2>75 & ass3>75) {
            result = "you are Promoted";
        }else {
            result = "sorry you are Demoted";
        }
    }

    void getTotal() {
        int total = ass1+ass2+ass3;
        System.out.println(String.format("you Total Score is: %d", total));
    }

    void getPercentage() {
        float percentage = (((float)(ass1+ass2+ass3)/300)*100);
        System.out.println(String.format("your Percentage is : %.1f", percentage));
    }

    public static void main(String[] args) {
        System.out.println("please enter the following details");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name:");
        String name =sc.next();
        System.out.println("enter your empid:");
        int empId= sc.nextInt();
        System.out.println("enter ass1 marks:");
        int ass1=sc.nextInt();
        System.out.println("enter ass2 marks:");
        int ass2=sc.nextInt();
        System.out.println("enter ass3 marks:");
        int ass3=sc.nextInt();
        Employee emp = new Employee(name, empId,ass1,ass2,ass3);
        System.out.println(String.format("Result of %s: %s", emp.name, emp.result));
        emp.getTotal();
        emp.getPercentage();
    }
}
