import java.util.Scanner;
public class IT24102510Lab7Q3{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  String Cash ="C";
  String Other ="O";
  int Count = 1;

  while(Count<=5){
  System.out.println("Customer "+Count);

  System.out.print("Enter total bill amount: ");
  double amount=scanner.nextDouble();
  
  System.out.print("Enter mode of payment (C for cash, O for other): ");
  String PayM=scanner.next();
  if(!PayM.equals("C") && !PayM.equals("O")) {
  System.out.println("Payment Mode is Not Valid");
  }
  else if(PayM.equals("C")){
  double discount= amount*0.05;
  double Subtotal= amount-discount;
  System.out.println("Discount is : "+discount);
  System.out.println("Amount to be paid: "+Subtotal);
  }
  else{
  System.out.println("No discount applicable");
  System.out.println("Amount to be paid: "+amount);
  }
  System.out.println();
  Count++;
 }
  
 }
}