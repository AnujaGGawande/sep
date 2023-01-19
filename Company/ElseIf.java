package Company;

public class ElseIf {
public static void main (String[] args) {
	
	int marks = 105;
	
	if (marks>= 35 && marks <=55)
	{System.out.println("the student will be in second class");}
	
	else if (marks >=56 && marks <=75)
	{System.out.println ("the student will be in first class");}
	
	else if (marks >=76 && marks<=100)
	{System.out.println("the student will be in distintion");}
	
	else if (marks >100)
	{System.out.println("invalid");}
			
	else if (marks < 35)
	{System.out.println("the student is fail");}
	
}
}
