package LogicalProgrames;

public class Palindrome {

	public static void main(String[] args) {
		String str="Harry",revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			revStr = revStr+ch;
		}
        if(str.equals(revStr))
        	System.out.println("Given string is Palindrome");
        else
        	System.out.println("Given String is not Palindrome");
	}

}
