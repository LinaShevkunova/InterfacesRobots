package Robot.hands;

public class SamsungHands implements IHand{
    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    public SamsungHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Мастер на все руки от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
