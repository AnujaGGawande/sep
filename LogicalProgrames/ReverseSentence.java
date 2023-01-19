package LogicalProgrames;

public class ReverseSentence {

	public static void main(String[] args) {
		String sentence="I am Post Graduate";
		System.out.println("Original Sentence="+sentence);
		String splitSent[]=sentence.split(" ");
		System.out.println("Reverse Sentence= ");
		for(int i=splitSent.length-1;i>0;i--);
		for(int i=splitSent.length-1;i>=0;i--)
			System.out.println(splitSent[i]+" ");
	}

}
