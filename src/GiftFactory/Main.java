package GiftFactory;

import GiftFactory.*;
import GiftFactory.*;
import GiftFactory.gifts.*;
import GiftFactory.visitors.GiftWrapperVisitor;
import GiftFactory.visitors.GreetingsVisitor;
import GiftFactory.visitors.IVisitor;
import GiftFactory.visitors.ToddlerFriendlyVisitor;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Nori", "Bonnie", "Gus", "Penny", "Jessie"};
        int[] ages = {3, 6, 9, 10, 12};
        boolean[] wellBehaved = {true, true, false, true, true};

        IVisitor wrapperVisitor = new GiftWrapperVisitor();

        for (int i = 0; i < names.length; i++) {
            System.out.println("\n" + (i + 1) + " CHILD");
            System.out.println("Child: " + names[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Well-behaved: " + wellBehaved[i]);

            IGift gift;

            if (!wellBehaved[i]) {
                gift = new Coal();
            } else if (ages[i] <= 3) {
                gift = new RubberDuck();
            } else if (ages[i] <= 6) {
                gift = new TeddyBear();
            } else if (ages[i] <= 10) {
                gift = new Lego();
            } else {
                gift = new Tablet();
            }

            System.out.println("\nGIFT WRAPPING");
            gift.accept(wrapperVisitor);

            System.out.println("\nSAFETY CHECK");
            IVisitor safetyVisitor = new ToddlerFriendlyVisitor(names[i], ages[i]);
            gift.accept(safetyVisitor);

            System.out.println("\nSPECIAL GREETINGS");
            IVisitor greetingVisitor = new GreetingsVisitor(names[i], ages[i]);
            gift.accept(greetingVisitor);
        }
    }
}