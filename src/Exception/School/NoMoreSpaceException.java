package Exception.School;

public class NoMoreSpaceException extends RuntimeException {

    public NoMoreSpaceException(String s) {   // konstruktor wyjątku pozwalający zwrócić wiadomość
        super(s);
    }
}
