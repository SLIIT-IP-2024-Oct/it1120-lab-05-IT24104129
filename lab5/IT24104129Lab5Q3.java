import java.util.Scanner;

public class IT24104129Lab5Q3{
	public static void main (String[] args){

		const dailyCharge = 48000; 
		System.out.println("Enter Starting date :");
		Scanner input1 = new Scanner(System.in);
		const startDay = input1.nextInt();
		System.out.println("Enter Ending  date :");
		const endDay = input1.nextInt();

		const duration = endDay - startDay;
		final totalAmountNoDiscount = duration*dailyCharge;

		//validation
		if (1 > startDay || startDay >31 || 1 > endDay || endDay >31 ||){
			System.out.println("Invalid Date entries Exiting now");
			end;
		}
		else if (endDate <= startDate){
			System.out.println("Start Date cannot be larger than End date or both dates are the same, Exiting");
			end;
		}
		else {
			        if (numberOfDays >= 3 && numberOfDays <= 4) {
            				totalAmount = totalAmountNoDiscount - (totalAmount * 10 / 100);
				}
         			else if (numberOfDays >= 5) {
            				totalAmount = totalAmountNoDiscount - (totalAmount * 20 / 100);
				}
   
			
		}
		
		
	}
}
