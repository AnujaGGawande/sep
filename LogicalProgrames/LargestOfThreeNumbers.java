package LogicalProgrames;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
    int a=41, b=42, c=33;
    if(a>b && a>c)         //false(0) && false(0)
    	System.out.println("Largest Number="+a);
    if(b>a && b>c)        //True(1) &&  True(1)
    	System.out.println("Largest Number="+b);
    if(c>a && c>b)        //false(0) && false(0)
    	System.out.println("Largest Number="+c);
	}

}
  // A     B      &&(Multiply)    ||(Add)
  // 0     0          0              0
  // 0     1          0              1
  // 1     0          0              1
  // 1     1          1              1 (2 Computer has binary language 0 & 1)