import java.util.ArrayList;
import java.util.List;

public class ChatImpl implements Chat {

    private final List<Message> messageList;
    private final List<User> userList;

    public ChatImpl() {
        messageList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public void sendMessage(Message message) {
        messageList.add(message);
    }

    @Override
    public void deleteMessage(Message message) {
        messageList.remove(message);
    }

    @Override
    public void likeMessage(Message message) {
        messageList.get(messageList.indexOf(message)).addLike();
    }

    @Override
    public void clearHistory() {
        messageList.clear();
    }

    @Override
    public void addUserToChat(User user) {
        userList.add(user);
    }
}
