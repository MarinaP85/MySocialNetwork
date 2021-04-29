import java.util.ArrayList;
import java.util.List;

public class GiftListImpl implements GiftList {
    private static final List<Gift> giftList = new ArrayList<>();

    static {
        giftList.add(new Gift("hello", "Hello!"));
        giftList.add(new Gift("birthday", "HappyBirthday"));
        giftList.add(new Gift("love", "I love you!"));
    }

    @Override
    public boolean deleteGift(Gift gift) {
        return giftList.remove(gift);
    }

    @Override
    public void addNewGift(Gift gift) throws GiftAlreadyExistException {
        if (giftList.contains(gift)) {
            throw new GiftAlreadyExistException("Такой gift уже существует.", gift.getGiftName());
        } else {
            giftList.add(gift);
        }
    }

    @Override
    public boolean changeGiftNyName(String nameGift, String textGiftNew) {
        boolean result = false;
        for (Gift gift : giftList) {
            if (gift.getGiftName().equals(nameGift)) {
                giftList.get(giftList.indexOf(gift)).setGiftText(textGiftNew);
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Gift getGiftByName(String nameGift) {
        Gift giftResult = null;
        for (Gift gift : giftList) {
            if (gift.getGiftName().equals(nameGift)) {
                giftResult = gift;
                break;
            }
        }
        return giftResult;
    }

}
