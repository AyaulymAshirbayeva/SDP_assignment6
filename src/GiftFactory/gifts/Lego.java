package GiftFactory.gifts;

import GiftFactory.visitors.IVisitor;

public class Lego implements IGift {
    private int pieces = 500;
    public int getPieces() {
        return pieces;
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}