import java.awt.image.BufferedImage;

public interface Gallery {
    //добавить фото в галерею
    void addPhoto(BufferedImage image);

    //удалить фото из галереи
    void deletePhoto(BufferedImage image);

    //поделиться фото с другим пользователем
    void sharePhoto(BufferedImage image, Account shareUser);
}
