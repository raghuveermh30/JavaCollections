package InterviewConcepts;

import java.util.Arrays;

public class ArmStrongNumber {

    //ArmStrong Number
    //153
    // 1*1*1 =1
    //5*5*5 = 125
    //3*3*3 = 27
    // 1 +125 +27 = 153

    //407
    //1 == 1*1*1 = 1
    //0
    //370,371

		/*int cube = 0;
		int rem;
		int temp;
		
		temp = num;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}
		
		if(temp == cube) {
			System.out.println("The Entered number is ArmStrong Number " );
		}
		else {
			System.out.println("The Entered Number is not an ArmStrong Number");
		}*/

    // Checks if a number is an Armstrong number

    public static void isArmstrongNumber(int num) {
        // Handle negative numbers
        if (num < 0) {
            System.out.println("Negative numbers cannot be Armstrong numbers: " + num);
            return;
        }

        // Store original number for comparison
        int originalNum = num;
        int sumOfCubes = 0;
        int numDigits = String.valueOf(num).length(); // Calculate number of digits

        // Calculate sum of each digit raised to the power of number of digits
        while (num > 0) {
            int digit = num % 10;
            sumOfCubes += (int) Math.pow(digit, numDigits);
            num /= 10;
        }

        // Return true if the sum equals the original number
        boolean isArmstrong = originalNum == sumOfCubes;
        System.out.printf("%d is %san Armstrong number%n",
                originalNum, isArmstrong ? "" : "not ");
	}


    public static void main(String[] args) {
		// Test cases using streams instead of for loop
		int[] testNumbers = {153, 407, 0, 370, 371, 121, -153};
		Arrays.stream(testNumbers)
				.forEach(ArmStrongNumber::isArmstrongNumber);
    }

}
