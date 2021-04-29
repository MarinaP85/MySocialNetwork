
public interface GiftList {

    //удалить подарок
    boolean deleteGift(Gift gift);

    //добавить новый подарок
    void addNewGift(Gift gift) throws GiftAlreadyExistException;

    //изменить текст подарка по заданному имени
    boolean changeGiftNyName(String nameGift, String textGiftNew);

    //получить подарок по имени
    Gift getGiftByName(String nameGift);
}
