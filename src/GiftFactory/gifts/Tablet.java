package GiftFactory.gifts;
import GiftFactory.visitors.IVisitor;

public class Tablet implements IGift {
    private int storage = 128;
    public int getStorage() {
        return storage;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}