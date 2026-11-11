package GiftFactory.visitors;
import GiftFactory.gifts.*;

public class GreetingsVisitor implements IVisitor {
    private String name;
    private int age;

    public GreetingsVisitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void printGreeting(String giftName) {
        System.out.println("New Year greeting for " + name + ":");
        if (age <= 3) {
            System.out.println("Happy New Year, little star!");

        } else if (age <= 6) {
            System.out.println("Happy New Year, " + name + "!");
            System.out.println("Enjoy your " + giftName + "!");

        } else {
            System.out.println("Dear " + name + "!");
            System.out.println("I wish you Happy New Year!");
            System.out.println("May all your dreams come true!");
            System.out.println("Enjoy your " + giftName + "!");
        }
    }

    @Override
    public void visit(Lego lego) {
        printGreeting("LEGO");
    }

    @Override
    public void visit(RubberDuck duck) {
        printGreeting("Rubber Duck");
    }

    @Override
    public void visit(TeddyBear bear) {
        printGreeting("Teddy Bear");
    }

    @Override
    public void visit(Tablet tablet) {
        printGreeting("Tablet");
    }

    @Override
    public void visit(Coal coal) {
        System.out.println("A special message for " + name + ":");
        System.out.println("Maybe next year you will be on Santa's nice list!");
    }
}