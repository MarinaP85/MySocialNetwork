public class Gift {
    private final String giftName;
    private String giftText;

    public Gift(String giftName, String giftText) {
        this.giftName = giftName;
        this.giftText = giftText;
    }

    public String getGiftName() {
        return giftName;
    }

    public String getGiftText() {
        return giftText;
    }

    public void setGiftText(String giftText) {
        this.giftText = giftText;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Gift objGift = (Gift) obj;
        return this.giftText.equals(objGift.getGiftText()) && (this.giftName.equals(objGift.getGiftName()));
    }

    @Override
    public String toString() {
        return String.format("'%s %s'", giftName, giftText);
    }
}
