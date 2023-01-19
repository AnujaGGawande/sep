package LogicalProgrames;

import java.util.Scanner;

public class EvenOddProg {

	public static void main(String[] args) {
	int num;
	System.out.println("Enter the Number");
	Scanner a= new Scanner(System.in);
	num = a.nextInt();
	System.out.println("Number="+ num);
	
	if(num%2==0)
		System.out.println("Even Number");
	else
		System.out.println("Odd Number");

	}

}
