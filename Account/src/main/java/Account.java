import java.util.List;

public class Account {
    private final User user;
    private List<Account> friends;
    private List<Account> blockUsers;
    private List<Chat> chats;
    private List<Gift> gifts;
    private Gallery gallery;

    public Account(User user) {
        this.user = user;
    }

    public List<Account> getFriends() {
        return friends;
    }

    public List<Account> getBlockUsers() {
        return blockUsers;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public List<Gift> getGifts() {
        return gifts;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public User getUser() {
        return user;
    }

    public void setFriends(List<Account> friends) {
        this.friends = friends;
    }

    public void setBlockUsers(List<Account> blockUsers) {
        this.blockUsers = blockUsers;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public void setGifts(List<Gift> gifts) {
        this.gifts = gifts;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public void addPhotoFromChat(Message message) {
        gallery.addPhoto(message.getImage());
    }

    public void blockUser(Account account) {
        if (!blockUsers.contains(account)) {
            this.blockUsers.add(account);
        }
    }

    public void unblockUser(Account account) {
        this.blockUsers.remove(account);
    }

    public void addToFriends(Account account) {
        if (!friends.contains(account)) {
            this.friends.add(account);
        }
    }

    public void deleteFromFriend(Account account) {
        this.friends.remove(account);
    }

    public void showFriends() {
        for (Account friend : friends) {
            System.out.println(friend.getUser().toString());
        }
    }

    public void showBlocked() {
        for (Account blocked : blockUsers) {
            System.out.println(blocked.getUser().toString());
        }
    }
}
