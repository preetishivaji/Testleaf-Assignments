package week1.day2;

public class IsPrime {

	public static void main(String[] args) 
	{
		int n=5,flag=0;
		for(int i=2;i<=n-1;i++)
		{
			if (n%i==0)
			{
				System.out.println("Not prime");
				flag=1;
				break;
				
			}
		}
		
	  if (flag==0) {
				System.out.println("Prime");
				}
		

	}

}
