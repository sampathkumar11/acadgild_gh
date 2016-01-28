class GskAssignment2_4{
public static void main (String[] args){
	String k=args[0];
	int m=Integer.parseInt(k);
	switch(m)
	{
	case 1:
	System.out.println("No of Days in the Month of January is 31");
	break;
	case 2:
	System.out.println("No of Days in the Month of February is 28.");
	System.out.println("No of Days in the Month of February is 29 (Leap year).");
	break;
	case 3:
	System.out.println("No of Days in the Month of March is 31.");
	break;
	case 4:
	System.out.println("No of Days in the Month of April is 30.");
	break;
	case 5:
	System.out.println("No of Days in the Month of May is 31.");
	break;
	case 6:
	System.out.println("No of Days in the Month of June is 30.");
	break;
	case 7:
	System.out.println("No of Days in the Month of July is 31.");
	break;
	case 8:
	System.out.println("No of Days in the Month of August is 31.");
	break;
	case 9:
	System.out.println("No of Days in the Month of September is 30.");
	break;
	case 10:
	System.out.println("No of Days in the Month of October is 31.");
	break;
	case 11:
	System.out.println("No of Days in the Month of November is 30.");
	break;
	case 12:
	System.out.println("No of Days in the Month of December is 31.");
	break;
	default:
	System.out.println("You have entered an invalid entry. Please enter 1 for January, 5 for May etc.,");
	
	}
}
}
