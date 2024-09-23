import java.util.Scanner;
public class IT24102510Lab7Q1B {
    public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int mark1, mark2, mark3, mark4;
	double avg;
	String Grade;
	int Student_num = 1;
	
	
	
	while (Student_num<=3) {
	
	System.out.print("Student" +Student_num);
	System.out.println();
	System.out.print("Enter marks:");
	mark1 = input.nextInt();
	mark2 = input.nextInt();
	mark3 = input.nextInt();
	mark4 = input.nextInt();
	
	
	avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
	System.out.println("Average is: " +avg);
	
	if (avg>=75 && avg<=100)
	{
	      Grade = "Distinction";
	}
		else if (avg >= 50 && avg <= 74)
		{
		Grade = "Credit";
		}
    else 
	{
          Grade = "Fail";
	}
	
	System.out.println("Overall Grade is:" +Grade);
	System.out.println();
	
	Student_num += 1;
	}
	}
	
	
	}
	
