package SAS;

import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		
		SubArraySum subArraySum = new SubArraySum();
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		testList.add(2);
		testList.add(-3);
		testList.add(-4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		System.out.println("max sub sum is: " + subArraySum.getMaxSubArray(testList));
	}

}
