package LogicalProgrames;

public class ReverseNumByString {

	public static void main(String[] args) {
    int num = 123456789;   //5 4 3 2 1
    String strNum = Integer.toString(num);
    String revNum="";
    
    for(int i=strNum.length()-1;i>=0;i--)
    {
    	char ch = strNum.charAt(i);
    	revNum=revNum+ch;
    }
    System.out.println("Reverse Num="+revNum);
	}

}
