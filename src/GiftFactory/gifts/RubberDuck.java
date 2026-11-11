package GiftFactory.gifts;
import GiftFactory.visitors.IVisitor;
public class RubberDuck implements IGift {
    private String material = "Soft rubber";
    public String getMaterial() {
        return material;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}