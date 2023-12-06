package week3.day2;

import java.util.*;

public class FindIntersectionAssignment {

	public static void main(String[] args) {
		int[] one = {3, 2, 11, 4, 6, 7};
		int[] second =  {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//Array1
		for (int i=0;i<one.length;i++)
		{
			list1.add(one[i]);
		}
		
		//Array2
		for (int j=0;j<second.length;j++)
		{
			list2.add(second[j]);
		}
		
		//Comparing
		for (int a=0;a<list1.size();a++)
		{
			for(int b=0;b<list2.size();b++)
			{
				if(list1.get(a)==(list2.get(b)))
				{
					System.out.println(list1.get(a));
				}
			}
		}

	}

}
