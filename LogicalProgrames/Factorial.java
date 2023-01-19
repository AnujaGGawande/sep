package LogicalProgrames;

public class Factorial {

	public static void main(String[] args) {
		// 4! =1*2*3*4=24
		int num =5, fact=1;
		for(int i=1;i<=num;i++)    //i=5
		{
			fact= fact*i;         //6*4=24
		}
       System.out.println("Factorial of "+num+"="+fact);
	}

}
