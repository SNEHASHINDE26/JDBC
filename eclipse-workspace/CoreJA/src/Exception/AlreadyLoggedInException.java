package Exception;

public class AlreadyLoggedInException extends Runtime Exception {
	public String getmessage()
	{
		return"cannot Login again";
	}

}
