package Company;

public class BlockProg {
   
	//Static block can run even without calling in main method.
	static {
		System.out.println("Static block");
	}
	
	//Instance block,no need to give the name and only called in main method by creating the object.
	{
		System.out.println("Instance block");
	}
	
	public BlockProg() {
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
       BlockProg a= new BlockProg();
	}

}
