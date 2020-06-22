package SAS;

import java.util.List;

public class SubArraySum {
	
	//Kadane's Algorithm
	public int getMaxSubArray(List<Integer> ArrayToCheck) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		
		for(int i=0; i<ArrayToCheck.size(); i++) {
			maxEndingHere += ArrayToCheck.get(i);
			
			if(maxEndingHere < 0) 
				maxEndingHere = 0;
			
			if(maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}
		
		return maxSoFar;
	}
	
}
