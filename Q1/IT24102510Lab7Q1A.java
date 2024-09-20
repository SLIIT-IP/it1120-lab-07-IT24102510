package LAB;


import java.util.Scanner;

public class IT24102510Lab7Q1A {

    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);

    double Sum = 0;
    double Average = 0;
    String Grade = "";

    System.out.println("Enter marks for four subjects :");

    System.out.println("Enter Subject Mark 1:");
    double mark1 = scanner.nextDouble();

    System.out.println("Enter Subject Mark 2:");
    double mark2 = scanner.nextDouble();

    System.out.println("Enter Subject Mark 3:");
    double mark3 = scanner.nextDouble();

    System.out.println("Enter Subject Mark 4:");
    double mark4 = scanner.nextDouble();


    Sum =mark1+mark2+mark3+mark4;
    Average = Sum/4;

    if(Average>74){

    Grade = "Distinction";
}
    else if(Average<49){
    Grade = "Fail";

}
    else{
    Grade = "Credit";
}

    System.out.println("Average is : "+Average);
    System.out.println("Overall Grade is : "+Grade);
 
   }
}
