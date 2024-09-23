import java.util.Scanner;
public class IT24102510Lab7Q1B{
public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  double totalmarks = 0;
  int count = 0;
  String Grade ="n";
  int Scount = 1;
 
  while(Scount<5){
  System.out.println("Student "+Scount);
  System.out.print("Enter marks : ");
  String input =scanner.nextLine();

  Scanner inputscanner = new Scanner(input);
  
  while(inputscanner.hasNext() && count < 4){
  if(inputscanner.hasNextDouble()){
    double mark = inputscanner.nextDouble();
    totalmarks += mark;
    count++; 
   }
    
  }
    double Average =0;
    Average = totalmarks/4;
    if(Average > 75 && Average<= 100){
     Grade ="Distinction";
    }else if(Average> 49 && Average< 75){
     Grade ="Credit";
    }else
     Grade ="Fail";
     System.out.println("Avarage is : "+Average);
     System.out.println("Overall Grade is : "+Grade);
     Scount++;
     System.out.println();
  }
 }
}
