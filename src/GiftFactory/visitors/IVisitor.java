package GiftFactory.visitors;
import GiftFactory.gifts.*;

public interface IVisitor {
    void visit(Lego lego);
    void visit(RubberDuck duck);
    void visit(TeddyBear bear);
    void visit(Tablet tablet);
    void visit(Coal coal);
}