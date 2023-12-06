package week3.day2;
import java.util.*;

public class MissingElementAssignment {

	public static void main(String[] args) {
		int[] arr =  {1, 2, 3, 4, 10, 6, 8};
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			nums.add(arr[i]);
		}
		
		Collections.sort(nums);
for (int i = nums.get(0); i < nums.get(nums.size()-1); i++) 
{
			
			if(!nums.contains(i)) 
			{
				
				System.out.println(i+" ");
			}
}	

	}

	}
