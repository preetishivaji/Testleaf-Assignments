package week3.day1;

public class ReversOddWordsAssignment {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] test1 = test.split(" ");
		
		for (int i=0;i<test1.length;i++)
		{
			if(i%2==1)
			{
				char[] ch = test1[i].toCharArray();
				for (int j=ch.length-1;j>=0;j--)
				{
					System.out.print(ch[j]);
				}
			}
			else
			{
				System.out.print(" "+test1[i]+" ");
			}
		}

	}

}
