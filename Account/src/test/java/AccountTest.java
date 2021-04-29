import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class AccountTest {
    @Test
    public void searchFriendTest() {
        FriendsUtils friends = Mockito.mock(FriendsUtils.class);
        Mockito.when(friends.searchFriend("Test")).thenReturn(new ArrayList<Account>());
        Assert.assertNotNull(friends.searchFriend("Test"));
    }

    @Test
    public void sendGiftTest() {
        FriendsUtils friends = Mockito.mock(FriendsUtils.class);
        Mockito.doReturn("test").when(friends).sendGift(new Account(new User("Test")),
                new Gift("test", "test"));
    }
}
