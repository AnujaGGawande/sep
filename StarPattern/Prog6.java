package StarPattern;

public class Prog6 {

	public static void main(String[] args) {
   //***
   // **
   //  *
   // **
   //***
		int star=3; int space=0;
		for(int row=1;row<=5;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
		  for (int j=1;j<=star;j++)
		  {
			System.out.print("*");
		  }
		
		System.out.println();
		
		if (row<=2) {
			star--;
			space++;
		} else {
       star++;
       space--;
		}
		
		}
	}

}
