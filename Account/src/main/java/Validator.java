public interface Validator {
    //проверить пароль
    boolean checkPassword(String name, String password);

    //войти в существующий акаунт
    Account enterExistingAccount(User user, String password) throws InvalidPasswordException;

    //создать новый аккаунт
    Account registerNewUser(User user, String password) throws LoginAlreadyExistException;
}
