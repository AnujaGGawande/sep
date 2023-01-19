package LogicalProgrames;

public class PrimeNum {

	public static void main(String[] args) {
		// Prime= 3 5 7 11 13 17 19 23
		int num=23, count=0;
		if(num>0)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)      //15%3==0
				{
					count++;      //0-->1
					break;
				}
			}
		}
        if(count==1)
        	System.out.println("Non Prime");
        	else 
				System.out.println("Prime");
  
	}

}
