public class GiftAlreadyExistException extends Exception {
    private final String name;

    public GiftAlreadyExistException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
