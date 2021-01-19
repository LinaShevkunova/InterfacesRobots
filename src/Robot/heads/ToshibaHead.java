package Robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speek() {
        System.out.println("Думаю головой от Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
