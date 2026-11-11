package GiftFactory.visitors;
import GiftFactory.gifts.*;

public class GiftWrapperVisitor implements IVisitor {
    @Override
    public void visit(Lego lego) {
        System.out.println("LEGO wrapped in colorful Christmas paper!");
    }
    @Override
    public void visit(RubberDuck duck) {
        System.out.println("Rubber Duck wrapped in yellow paper!");
    }
    @Override
    public void visit(TeddyBear bear) {
        System.out.println("Teddy Bear wrapped in cute Christmas paper!");
    }
    @Override
    public void visit(Tablet tablet) {
        System.out.println("Tablet wrapped in protective Christmas packaging!");
    }
    @Override
    public void visit(Coal coal) {
        System.out.println("Coal wrapped in black paper!");
    }
}