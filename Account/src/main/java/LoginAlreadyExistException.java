public class LoginAlreadyExistException extends Exception {
    private final String login;

    public LoginAlreadyExistException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}
