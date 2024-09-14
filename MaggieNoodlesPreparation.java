public class MaggieNoodlesPreparation {

    public static void main(String[] args) {
        System.out.println("Starting the preparation of Maggie noodles...");

        // Step 1: Boil water
        boilWater();

        // Step 2: Add noodles
        addNoodles();

        // Step 3: Add tastemaker
        addTastemaker();

        // Step 4: Cook for a few minutes
        cook();

        // Step 5: Serve
        serve();

        System.out.println("Maggie noodles are ready to eat!");
    }

    public static void boilWater() {
        System.out.println("Boiling water...");
        // Simulate the time taken to boil water
        try {
            Thread.sleep(2000); // 2 seconds delay to simulate boiling
        } catch (InterruptedException e) {
            System.out.println("An error occurred while boiling water.");
        }
        System.out.println("Water is boiled.");
    }

    public static void addNoodles() {
        System.out.println("Adding noodles to the boiling water...");
        // Simulate the time taken to add noodles
        try {
            Thread.sleep(1000); // 1 second delay to simulate adding noodles
        } catch (InterruptedException e) {
            System.out.println("An error occurred while adding noodles.");
        }
        System.out.println("Noodles are added.");
    }

    public static void addTastemaker() {
        System.out.println("Adding tastemaker...");
        // Simulate the time taken to add tastemaker
        try {
            Thread.sleep(500); // 0.5 seconds delay to simulate adding tastemaker
        } catch (InterruptedException e) {
            System.out.println("An error occurred while adding tastemaker.");
        }
        System.out.println("Tastemaker is added.");
    }

    public static void cook() {
        System.out.println("Cooking the noodles...");
        // Simulate the time taken to cook noodles
        try {
            Thread.sleep(3000); // 3 seconds delay to simulate cooking
        } catch (InterruptedException e) {
            System.out.println("An error occurred while cooking noodles.");
        }
        System.out.println("Noodles are cooked.");
    }

    public static void serve() {
        System.out.println("Serving the noodles...");
        // Simulate the time taken to serve noodles
        try {
            Thread.sleep(1000); // 1 second delay to simulate serving
        } catch (InterruptedException e) {
            System.out.println("An error occurred while serving noodles.");
        }
        System.out.println("Noodles are served.");
    }
}
