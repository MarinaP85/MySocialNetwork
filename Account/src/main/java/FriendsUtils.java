import java.time.LocalDate;
import java.util.List;

public interface FriendsUtils {

    //найти аккаунты с заданным именем
    List<Account> searchFriend(String name);

    //найти аккаунты с заданным именемб полом и возрастом
    List<Account> searchFriend(String name, String gender, LocalDate dateOfBirth);

    //найти конкретный аккаунт по логину
    Account searchFriendByIdLogin(String login);

    //послать подарок
    void sendGift(Account account, Gift gift);

}
