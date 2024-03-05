//Membuat custom exception
public class CustomAgeException extends RuntimeException {

    //konstruktor CustomAgeException
    public CustomAgeException (String message){
        super(message);
    }
}
