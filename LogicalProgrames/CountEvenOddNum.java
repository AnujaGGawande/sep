package LogicalProgrames;

public class CountEvenOddNum {

	public static void main(String[] args) {
		int num=12121314,countEven=0,countOdd=0;
		int rem;
		while(num>0)
		{
			rem=num % 10;  //4
			if(rem%2==0)
				countEven++;  //1
			else
				countOdd++;
			num=num/10;
		}
      System.out.println("Even count="+countEven);
      System.out.println("Odd count="+countOdd);
	}

}
