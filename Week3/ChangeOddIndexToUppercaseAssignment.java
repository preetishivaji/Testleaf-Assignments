package week3.day1;

public class ChangeOddIndexToUppercaseAssignment {

	public static void main(String[] args) {
		String test = "changeme";
		char[] arr = test.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}

	}

}
