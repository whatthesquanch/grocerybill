# grocerybill
This pseudocode outlines the steps involved in creating a Java program to calculate and display the average weekly and monthly grocery bill for a family of four with and without a coupon. 

1.	Import Scanner Class to take input from user

2.	Initialize Variables
         couponAmount
         groceryBills
         weeklyAvgWithoutCoupon
         weeklyAvgWithCoupon
         monthlyTotal

3.	Input the coupon amount:
Prompt user for a coupon amount as a decimal
Ensure the value is between 0 and 1, set to 0.1 (10%) if not within range

4.	Initialize an array to store weekly grocery bills

5.	Input grocery bills for weeks 1-4:
Loop 4 times:
Prompt user for grocery bill for each week
Store each bill in the array and add it to monthlyTotal

6.	Calculate monthly and weekly averages:
Calculate monthlyTotal
Calculate weeklyAvgWithoutCoupon by dividing monthlyTotal by 4
Calculate monthlyTotal with the coupon (apply the coupon percentage)
Calculate weeklyAvgWithCoupon by dividing the modified monthlyTotal by 4

7.	Display the results:
Display monthlyTotal without coupon
Display weeklyAvgWithoutCoupon
Display monthlyTotal with coupon
Display weeklyAvgWithCoupon
