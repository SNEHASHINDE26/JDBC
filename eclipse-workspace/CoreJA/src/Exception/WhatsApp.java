package Exception;
import java.util.Scanner;

public class WhatsApp {
	User u;
	public void Login(user u) {
		if(this.u==null) {
			this.u=u;
			System.out.println("Login Successfull....");
		}
		else {
			throw new AlreadyLoggedInException();
		}
	}

}
