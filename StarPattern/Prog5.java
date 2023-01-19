package StarPattern;

public class Prog5 {

	public static void main(String[] args) {
		//*****
		// ***
		//  *
		int star=5, space=0;
		for(int row=1;row<=3;row++)
		{
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}

	}

}
