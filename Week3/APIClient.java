package week3.day1;

public class APIClient {
	public void sendRequest(String test) 
	{
		System.out.println(test);
	}
	
	public void sendRequest(String a,String b,boolean boo) 
	{
		System.out.println(a+" "+b+" "+boo);
	}

	public static void main(String[] args) {
		APIClient api=new APIClient();
		api.sendRequest("Hi");
		api.sendRequest("Hi", "Hello", true);

	}

}
