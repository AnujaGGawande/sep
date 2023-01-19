package LogicalProgrames;

public class ReverseNum {

	public static void main(String[] args) {
      //12345 = 54321
		int num = 12345, revNum=0, rem, multiFactor=10000;
		System.out.println("Original Number="+num);
		for(int i=0;i<5;i++)
		{
			rem = num%10;    //4  //5
			num=num/10;      //1234-->123
			revNum=revNum+rem*multiFactor;   //50000+(4*1000)=54321
			multiFactor=multiFactor/10;     //1000-->100
			System.out.println("Reverse by interation="+revNum);
		}
		System.out.println("Final Reversal="+revNum);
	}

}
