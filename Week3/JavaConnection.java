package week3.day2;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
		

	}

	@Override
	public void connect() {
		System.out.println("connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeupdate");
		
	}

}
