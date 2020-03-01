package OOPS1.Constructors;

public class Login {

	String userName;
	String password;
	String emailId;
	int otp;
	long mobileNumber;
	String facebookId;
	
	public Login() {
		System.out.println("Default constructor");
	}

	public Login(String userName, String password, String emailId, int otp, long mobileNumber, String facebookId) {
		super();
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.otp = otp;
		this.mobileNumber = mobileNumber;
		this.facebookId = facebookId;
	}

	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public Login(String emailId, int otp) {
		super();
		this.emailId = emailId;
		this.otp = otp;
	}

	
	   public void doLogin() { // Business Logic cannot be created inside a CONSTRUCTOR Login(){.....}
	    System.out.println("Login with: "+emailId+" "+otp); 
	   }
	 

	public static void main(String[] args) {
		//Login l2 = new Login(); // This is not allowed if we haven't defined 0 parameterized constructor

		// In Java if default constructor/ 0 parameterized constructor is not there, then Java will automatically create
		// during runtime. This is called HIDDEN CONSTRUCTOR.
		// If we perform CONSTRUCTOR OVERLOADING, then we MUST define default constructor as well. JAVA will not create
		// default constructor automatically

		Login l1 = new Login("sumit@gmail.com", 1234);
		l1.doLogin();
	}
}
