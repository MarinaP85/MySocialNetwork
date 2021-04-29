import java.awt.image.BufferedImage;

public interface Chat {

    //послать сообщение в чат
    void sendMessage(Message message);

    //удалить сообщение из чата
    void deleteMessage(Message message);

    //поставить лайк к сообщению
    void likeMessage(Message message);

    //очистить все сообщения чата
    void clearHistory();

    //добавить пользователя в чат
    void addUserToChat(User user);
}
