package LogicalProgrames;

public class NumberCount {

	public static void main(String[] args) {
    int num=12121314,count=0;
    while(num>0)        //num=0
    {
    	num=num/10;     //num=0
    	count++;        //count=8
    }
    System.out.println("Number of count of given no="+count);
	}

}
