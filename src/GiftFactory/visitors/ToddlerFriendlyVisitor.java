package GiftFactory.visitors;
import GiftFactory.gifts.*;

public class ToddlerFriendlyVisitor implements IVisitor {
    private String name;
    private int age;

    public ToddlerFriendlyVisitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void checkAgeCategory(String giftName, int minAge, int maxAge) {
        System.out.println(giftName + ":");
        System.out.println("Suitable age: "
                + minAge + "-" + maxAge + " years");
        if (age >= minAge && age <= maxAge) {
            System.out.println("Suitable for " + name + "!");
        } else {
            System.out.println("Not suitable for "
                    + name + " (" + age + " years old).");
        }
    }

    @Override
    public void visit(Lego lego) {
        checkAgeCategory("LEGO", 7, 10);
    }

    @Override
    public void visit(RubberDuck duck) {
        checkAgeCategory("Rubber Duck", 0, 3);
    }

    @Override
    public void visit(TeddyBear bear) {
        checkAgeCategory("Teddy Bear", 0, 6);
    }

    @Override
    public void visit(Tablet tablet) {
        checkAgeCategory("Tablet", 11, 18);
    }

    @Override
    public void visit(Coal coal) {
        System.out.println("Coal: Not a suitable gift for toddlers.");
    }
}