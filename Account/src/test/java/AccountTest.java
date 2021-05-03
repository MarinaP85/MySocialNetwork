import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;

public class AccountTest {
    private static Gift newGift1;
    private static Account accountTest;
    private static Account accountTest1;
    private static Account accountTest2;
    private static Account accountTest3;
    private static User userTest;
    private static User userTest1;
    private static User userTest2;
    private static User userTest3;

    @BeforeClass
    public static void beforeTests() {
        newGift1 = new Gift("flower", "Rose!");
        userTest = new User("TestLG", "TestName", "male",
                LocalDate.of(1980, 4, 30));
        accountTest = new Account(userTest);
        userTest1 = new User("TestLG1", "TestName1", "female",
                LocalDate.of(1990, 2, 10));
        accountTest1 = new Account(userTest1);
        userTest2 = new User("TestLG2", "TestName2", "female",
                LocalDate.of(1975, 12, 6));
        accountTest2 = new Account(userTest2);
        userTest3 = new User("TestLG3", "TestName3", "male",
                LocalDate.of(1982, 7, 24));
        accountTest3 = new Account(userTest3);
    }

    @Test
    public void searchFriendTest() {
        FriendsUtils friends = Mockito.mock(FriendsUtils.class);
        Mockito.when(friends.searchFriend("Test")).thenReturn(new ArrayList<>());
        Assert.assertNotNull(friends.searchFriend("Test"));
    }

    @Test
    public void sendGiftTest() {
        FriendsUtils friends = Mockito.mock(FriendsUtils.class);
        Mockito.doNothing().when(friends).sendGift(accountTest1, newGift1);
        friends.sendGift(accountTest1, newGift1);
        Mockito.verify(friends).sendGift(accountTest1, newGift1);
    }

    @Test(expected = LoginAlreadyExistException.class)
    public void ValidatorTest() throws LoginAlreadyExistException {
        Validator validator = Mockito.mock(Validator.class);
        Mockito.doThrow(new LoginAlreadyExistException("Такой логин уже существует", "TestLG")).
                when(validator).registerNewUser(userTest, "test");
        validator.registerNewUser(userTest, "test");
    }

    @Test
    public void addToFriendsTest() {
        Assert.assertTrue(accountTest.addToFriends(accountTest1));
        Assert.assertTrue(accountTest.addToFriends(accountTest2));
        Assert.assertTrue(accountTest.addToFriends(accountTest3));
        Assert.assertFalse(accountTest.addToFriends(accountTest2));
        System.out.println("friends:");
        accountTest.showFriends();
    }

    @Test
    public void blockUserTest() {
        accountTest.addToFriends(accountTest1);
        accountTest.addToFriends(accountTest2);
        accountTest.addToFriends(accountTest3);
        Assert.assertTrue(accountTest.blockUser(accountTest3));
        System.out.println("friends:");
        accountTest.showFriends();
        System.out.println("blocked:");
        accountTest.showBlocked();
    }

    @AfterClass
    public static void afterTests() {
        newGift1 = null;
        accountTest = null;
        userTest = null;
        accountTest1 = null;
        userTest1 = null;
        accountTest2 = null;
        userTest2 = null;
        accountTest3 = null;
        userTest3 = null;
    }
}
