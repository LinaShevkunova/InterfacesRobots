package Robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Думаю головой от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
