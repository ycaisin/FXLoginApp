package main;

public class UserAuthenticationService {

	public static boolean checkUser(String username, String password) {
		return username.equals("admin") && password.endsWith("123");
	}
	
}
