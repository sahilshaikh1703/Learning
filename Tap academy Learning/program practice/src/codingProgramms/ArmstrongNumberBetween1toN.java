package codingProgramms;

import java.util.HashSet;
import java.util.Set;

public class ArmstrongNumberBetween1toN {

	public static void main(String[] args) {
		int lastNum = 1000;
  Set armstrongSet =  new HashSet();
		
		for (int num = 1; num <= lastNum; num++) {
			
			int count = 0;

			int orginalNum = num;
			String n = Integer.toString(num);
			while (num != 0) {
				num = num / 10;
				++count;
			}
			num = orginalNum;
			int sum = 0;
			for (int i = 0; i < count; i++) {
				int digit = Character.getNumericValue(n.charAt(i)); // Convert character to integer

				sum = sum + (int) Math.pow(digit, count);
			}

			if (sum == num)

			{
				armstrongSet.add(num);
			} 

		}
		System.out.println("The Armstrong Numbers between 1 & "+lastNum + " are: " +   armstrongSet);
	}
}
