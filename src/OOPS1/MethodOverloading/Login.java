package OOPS1.MethodOverloading;

public class Login {
	
		public void login() {
		}
	
		public void login(String username){			
		}	
	
		public void login(String username, String password) {
		}	
	
		public void login(int OTP) {
		}
		
		public void login(String facebookID, int phoneNum) {
		}
		
		public void login(long phoneNum, String facebookID) {
		}
	
	public static void main(String[] args) {
		Login obj= new Login();
		obj.login();
		obj.login("Sumit@gmail.com", "password");
		obj.login( Long.parseLong("0199183792183"), "sumit786.88@gmail.com");
	}

}
