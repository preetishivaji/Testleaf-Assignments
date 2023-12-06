package week3.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("commantasks_child");
	}

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.findElement();
		login.clickElement();
		login.enterText();
		login.performCommonTasks();

	}

}
