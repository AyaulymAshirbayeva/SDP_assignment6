package GiftFactory.gifts;
import GiftFactory.visitors.IVisitor;
public interface IGift {
    void accept(IVisitor visitor);
}