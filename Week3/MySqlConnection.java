package week3.day2;

public abstract class MySqlConnection implements DatabseConnection {

	public abstract void connect();

	public abstract void disconnect(); 

	public abstract void executeUpdate();
	
	public void executeQuery() {
		System.out.println("executeQuery");
	}

}
