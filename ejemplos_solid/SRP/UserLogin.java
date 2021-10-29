package SRP;

public class UserLogin {
	private DataBase db;
	
	public UserLogin(DataBase db){
		this.db = db;
	}
	
	public void login(String userName, String password) {
		User user = db.findUserByUserName(userName);
		if(user == null) {
			// do something
		}
		// login process..
	}
}
