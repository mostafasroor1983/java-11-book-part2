package five.threading.issues;

import java.util.concurrent.*;

class Food {
}

class Water {
}

public class DeadlockFox {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println("Got Food!");
            move();
            synchronized (water) {
                System.out.println("Got Water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println("Got Water!");
            move();
            synchronized (food) {
                System.out.println("Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        // Handle exception
        }
    }


    //deadlock because both participants are permanently blocked, waiting on resources
    //that will never become available.
    public static void main(String[] args) {
        // Create participants and resources
        DeadlockFox foxy = new DeadlockFox();
        DeadlockFox tails = new DeadlockFox();
        Food food = new Food();
        Water water = new Water();

        // Process data
        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() ->
                    foxy.eatAndDrink(food, water));
            service.submit(() ->
                    tails.drinkAndEat(food, water));
        } finally {
            if (service != null) service.shutdown();
        }
    }
}