class GskAssignment2_1{
public static void main(String args[]){
	//System.out.println("Please enter your age :");
	String age=args[0];
	if(age==""){
		System.out.println("You have not entered any value. Please try again!");
		}else{
			System.out.println("Your input is "+age);
			int iage=Integer.parseInt(age);
			if(iage>=18){
				System.out.println("You are eligible to vote");
			}else{
				System.out.println("Your are NOT ELIGIBLE to vote as your age is "+iage+".");
			}
		}
	}
}