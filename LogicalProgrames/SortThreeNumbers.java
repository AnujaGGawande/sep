package LogicalProgrames;

public class SortThreeNumbers {

	public static void main(String[] args) {
    int a=40, b=21, c=33;
    System.out.println(a+" "+b+" "+c);
    if(a>b) {
    	int temp=a;
    	a=b;
    	b=temp;
    	System.out.println("First Interation="+ a+" "+b+" "+c);
    }
    if(b>c) {
    	int temp=b;
    	b=c;
    	c=temp;
    	System.out.println("Second Interation=" +a+" "+b+" "+c);
    }
    if(a>c) {
    	int temp=a;
    	a=c;
    	c=temp;
    	System.out.println("Third Interation="+a+" "+b+" "+c);
    }
	}

}
