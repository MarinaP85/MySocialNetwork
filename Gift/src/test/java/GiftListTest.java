import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GiftListTest {
    private static Gift newGift1;
    private static Gift newGift2;
    private static GiftList giftList;

    @BeforeClass
    public static void beforeTests() {
        newGift1 = new Gift("flower", "Rose!");
        newGift2 = new Gift("love", "I love you!");
        giftList = new GiftListImpl();
    }

    @Test
    public void getGiftByNameTest() {
        Assert.assertEquals(giftList.getGiftByName("love"), newGift2);
        System.out.println(giftList.getGiftByName("love").toString());
        System.out.println(newGift2.toString());
        Assert.assertNotEquals(giftList.getGiftByName("happy"), newGift1);
        System.out.println(giftList.getGiftByName("love").toString());
        System.out.println(newGift1.toString());
        Assert.assertNull(giftList.getGiftByName("flower"));
    }

    @Test
    public void addNewGiftTest() {
        Assert.assertThrows(GiftAlreadyExistException.class, () -> giftList.addNewGift(newGift2));
    }

    @Test
    public void deleteGiftTest() throws GiftAlreadyExistException {
        giftList.addNewGift(newGift1);
        Assert.assertTrue(giftList.deleteGift(newGift1));
        Assert.assertFalse(giftList.deleteGift(newGift1));
    }

    @Test
    public void changeGiftNyNameTest() {
        Assert.assertTrue(giftList.changeGiftNyName("love", "I love you so much!"));
        Assert.assertFalse(giftList.changeGiftNyName("sleep", "I'm sleeping now!"));
    }

    @AfterClass
    public static void afterTests() {
        newGift1 = null;
        newGift2 = null;
        giftList = null;
    }
}
