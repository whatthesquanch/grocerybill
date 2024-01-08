import java.util.Scanner;

public class GroceryBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

// Initialize variables
double couponAmount, monthlyTotal = 0, weeklyAvgWithoutCoupon = 0, weeklyAvgWithCoupon;

// Input the coupon amount
System.out.print("Enter the coupon amount as a decimal (e.g., 0.10)");
couponAmount = scanner.nextDouble();

// Ensure coupon amount is within the range
if (couponAmount <= 0 || couponAmount > 1) {
	couponAmount = 0.1; // Set default coupon amount to 10%
}

double[] groceryBills = new double[4]; // Array to store weekly grocery bills 

// Input grocery bills for weeks 1-4
for (int i = 0; i < 4; i++) {
	System.out.print("Enter grocery bill for week " + (i + 1) + ": ");
	groceryBills[i] = scanner.nextDouble();
	monthlyTotal += groceryBills[i];
}

// Calculate averages and totals
weeklyAvgWithoutCoupon = monthlyTotal / 4;
monthlyTotal *= (1 - couponAmount);
weeklyAvgWithCoupon = monthlyTotal / 4;

// Display the results
System.out.println("Monthly total without coupon: $" + monthlyTotal / (1 - couponAmount));
System.out.println("Weekly average without coupon: $" + weeklyAvgWithoutCoupon);
System.out.println("Monthly total with coupon: $" + monthlyTotal);
System.out.println("Weekly average with coupon: $" + weeklyAvgWithCoupon);

scanner.close();
}
	}

