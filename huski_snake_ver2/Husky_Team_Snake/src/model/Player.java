package model;



public class Player {
	
	private String User_Name;
	
	
	
	//******constructor********///
	public Player(String user_Name) {
		super();
		User_Name = user_Name;
	}
	//************Getters and Setters**********//
	private String User_Number;
	public String getUser_Number() {
		return User_Number;
	}
	public void setUser_Number(String user_Number) {
		User_Number = user_Number;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	
	
}

