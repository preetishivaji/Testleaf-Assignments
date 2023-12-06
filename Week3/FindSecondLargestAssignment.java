package week3.day2;

import java.util.*;

public class FindSecondLargestAssignment {

	public static void main(String[] args) {
		
		int[] arr =  {3, 2, 11, 4, 6, 7};
		List<Integer> number = new ArrayList<Integer>();
		
		for (int i=0;i<arr.length;i++)
		{
			number.add(arr[i]);
		}
		
		Collections.sort(number);
		System.out.println(number);
		int size = number.size();
		System.out.println("Secong largest number is " + number.get(size-2));


	}

}
