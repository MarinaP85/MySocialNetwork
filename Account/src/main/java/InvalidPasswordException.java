public class InvalidPasswordException extends Exception {
    private final String name;
    private final String password;

    public InvalidPasswordException(String message, String name, String password) {
        super(message);
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }
}
