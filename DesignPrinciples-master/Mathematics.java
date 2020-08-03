package junitprograms;

import java.util.Arrays;

public class Mathematics {
	public boolean isEven(int n) {
		if(n%2 ==0)
			return true;
		else
			return false;
	}
	public int[] sortArray(int[] input) {
		Arrays.sort(input);
		return input;
	}
	public boolean isNull(String str) {
		if(str ==null)
			return true;
		else
			return false;
	}
}