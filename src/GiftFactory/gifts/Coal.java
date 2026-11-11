package GiftFactory.gifts;
import GiftFactory.visitors.IVisitor;

public class Coal implements IGift {
    private String reason = "Naughty behavior";
    public String getReason() {
        return reason;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}