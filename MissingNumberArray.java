package week1.day2;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		int [] missing = {1, 4, 3, 2, 8, 6, 7}; 
		
		Arrays.sort(missing);
		for (int i=0;i<missing.length;i++)
		{
			if (missing[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
		

	}

}
