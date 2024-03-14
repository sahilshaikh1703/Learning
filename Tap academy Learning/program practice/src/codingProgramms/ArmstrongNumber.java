package codingProgramms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int count = 0, num = 153;
		int orginalNum = num;
		String n = Integer.toString(num);

		while (num != 0) {
			num = num / 10;
			++count;
		}
		System.out.println("Number of digits: " + count);
		num = orginalNum;
		int sum = 0;
		for (int i = 0; i < count; i++) {
			int digit = Character.getNumericValue(n.charAt(i)); // Convert character to integer

			sum = sum + (int) Math.pow(digit, count);
		}

		System.out.println("The Total Sum is : " + sum);
		if (sum == num)

		{
			System.out.println("It is an Armstrong Number ");
		} else {
			System.out.println("It is not an Armstrong Number ");

		}
	}

}