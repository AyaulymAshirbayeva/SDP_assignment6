package GiftFactory.visitors;
import GiftFactory.gifts.*;

public class ToddlerFriendlyVisitor implements IVisitor {
    @Override
    public void visit(Lego lego) {
        System.out.println("LEGO: Not suitable for toddlers. "
                + lego.getPieces() + " small pieces.");
    }
    @Override
    public void visit(RubberDuck duck) {
        System.out.println("Rubber Duck: Suitable for toddlers. "
                + duck.getMaterial() + ".");
    }
    @Override
    public void visit(TeddyBear bear) {
        System.out.println("Teddy Bear: Suitable for toddlers. "
                + bear.getMaterial() + ".");
    }
    @Override
    public void visit(Tablet tablet) {
        System.out.println("Tablet: Not suitable for toddlers. "
                + tablet.getStorage() + " GB storage.");
    }
    @Override
    public void visit(Coal coal) {
        System.out.println("Coal: Not a suitable children's gift.");
    }
}