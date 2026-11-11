package GiftFactory.visitors;
import GiftFactory.gifts.*;

public class GiftWrapperVisitor implements IVisitor {
    @Override
    public void visit(Lego lego) {
        System.out.println("LEGO wrapped in colorful New Year paper!");
    }
    @Override
    public void visit(RubberDuck duck) {
        System.out.println("Rubber Duck wrapped in colourful paper!");
    }
    @Override
    public void visit(TeddyBear bear) {
        System.out.println("Teddy Bear wrapped in cute New Year paper!");
    }
    @Override
    public void visit(Tablet tablet) {
        System.out.println("Tablet wrapped in protective New Year packaging!");
    }
    @Override
    public void visit(Coal coal) {
        System.out.println("Coal wrapped in black paper!");
    }
}