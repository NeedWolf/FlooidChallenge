public class Promotion {
    enum DiscountType {
        FLAT,
        FREE_ITEM
    }
    private int minimumAmount;
    private DiscountType discountType;
    private int discount;
    private Item item;

    public Promotion(int minimumAmount, DiscountType discountType, int discount, Item item) {
        this.minimumAmount = minimumAmount;
        this.discountType = discountType;
        this.discount = discount;
        this.item = item;
    }

    public double getDiscount(int itemAmount) {
        switch (discountType) {
            case FLAT:
                if (itemAmount >= minimumAmount)
                    return discount * itemAmount;
                else
                    return 0;
            case FREE_ITEM:
                int freeItems = (int) Math.floor(itemAmount / minimumAmount);
                return freeItems * item.getPrice();
            default:
                return 0;
        }
    }

}