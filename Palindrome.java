package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num = 12321,output=0,input;
		input = num;
		for (;num>0;num/=10) 
		{
      	  int temp = num%10;
      	  output = output * 10 + temp;
      	 
         }
      
        if (input == output ) {
      	  System.out.println("The given number is a Palindrome");
        }
        else {
      	  System.out.println("The given number is not a Palindrome");  
        }
}
}
