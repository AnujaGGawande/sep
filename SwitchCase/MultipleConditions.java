package SwitchCase;

public class MultipleConditions {

	public static void main(String[] args) {
		String day = "Wow,its weekend"; //+-/*
		
		switch(day)
		{
		case"Monday":
		   System.out.println("Today is Monday");
		    break;
		case"Tuesday":
		   System.out.println("Today is Tuesday");
		   break;
		case "Wednesday":
		System.out.println("Today is Wednesday");
		break;
		case "Thursday":
		System.out.println("Today is Thursday");
		break;
		case "Friday":
		System.out.println("Today is Friday");
		break;
		default:
			System.out.println("Wow,its weekend!");
		}
	//system.out.println("Switched finished");
		
	}

}
