package users;
import enums.*;

public class Account {
	  private String id;
	  private String password;
	  private String name;
	  private AccountStatus status;
	  private Location address;
	  private String email;
	  private String phone;

	  public boolean resetPassword() {
		return false;
	}
}
