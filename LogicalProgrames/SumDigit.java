package LogicalProgrames;

public class SumDigit {

	public static void main(String[] args) {
    int num =12345,rem,sum=0;
    while(num>0)      //iteration=5
    {
    	rem = num%10;     //1%10=1
    	sum=sum+rem;     //14+1=15
    	num=num/10;      //0
    	System.out.println("Sum by iteration="+sum);
    }
		System.out.println("---------------");
		System.out.println("Final Sum="+sum);
	}

}
