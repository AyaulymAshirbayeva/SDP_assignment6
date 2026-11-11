package GiftFactory.gifts;
import GiftFactory.visitors.IVisitor;

public class TeddyBear implements IGift {
    private String material = "Plush";
    public String getMaterial() {
        return material;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}