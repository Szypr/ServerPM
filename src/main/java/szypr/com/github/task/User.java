package szypr.com.github.task;

/**
 * Class for future logging and project dependences implementation
 * 
 * @author Mateusz Szyprowski
 *
 */


public class User {
	private String userId;
	private String userMail;
	private String password;
	
	public User() {
		
	}
	
	public User(String userId, String userMail, String password) {
		this.userId = userId;
		this.userMail = userMail;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
