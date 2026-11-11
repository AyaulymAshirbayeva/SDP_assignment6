package GiftFactory;

import GiftFactory.gifts.*;
import GiftFactory.visitors.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Alex",
                "Emma",
                "Oliver",
                "Sophia",
                "Daniel"
        };

        int[] ages = {
                2, 7, 5, 10, 12
        };

        boolean[] wellBehaved = {
                true, true, false, true, false
        };

        IVisitor wrapperVisitor = new GiftWrapperVisitor();
        IVisitor safetyVisitor = new ToddlerFriendlyVisitor();

        for (int i = 0; i < names.length; i++) {

            System.out.println("\n");
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

            System.out.println("\n--- Gift Wrapping ---");
            gift.accept(wrapperVisitor);

            System.out.println("\n--- Safety Check ---");
            gift.accept(safetyVisitor);

            System.out.println("\n--- Christmas Greeting ---");

            IVisitor greetingVisitor =
                    new GreetingsVisitor(names[i], ages[i]);

            gift.accept(greetingVisitor);
        }
    }
}