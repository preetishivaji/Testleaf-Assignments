package week3.day1;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Username");
	}
	
	public void enterPassword() {
		System.out.println("Password");
	}
	
	public static void main(String[] args) {
		
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();

	}

}
