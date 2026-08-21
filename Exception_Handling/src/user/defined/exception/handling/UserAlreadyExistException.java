package user.defined.exception.handling;

public class UserAlreadyExistException extends RuntimeException{
       public UserAlreadyExistException(String _message) {
    	   super(_message);
       }
}
