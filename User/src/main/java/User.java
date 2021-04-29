import java.time.LocalDate;

public class User {
    private String login;
    private String name;
    private String gender;
    private LocalDate dateOfBirth;

    public User(String login, String name, String gender, LocalDate dateOfBirth) {
        this.login = login;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String login) {
        this.login = login;
    }

    public String getLogin() { return login; }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    public void setLogin(String login) { this.login = login; }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return String.format("'%s %s %s'", name, gender, dateOfBirth);
    }
}
