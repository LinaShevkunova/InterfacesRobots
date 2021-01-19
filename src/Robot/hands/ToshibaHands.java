package Robot.hands;

public class ToshibaHands implements IHand{
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    public ToshibaHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Мастер на все руки от Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

