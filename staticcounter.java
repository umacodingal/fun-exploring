// Define the Employee class
class staticounter {
    private String name;
    private int id;
    private static int instanceCount = 0; // Static counter to keep track of instances

    // Constructor to initialize Employee objects
    public staticounter(String name, int id) {
        this.name = name;
        this.id = id;
        instanceCount++; // Increment static counter each time an instance is created
    }

    // Getter for the employee name
    public String getName() {
        return name;
    }

    // Getter for the employee ID
    public int getId() {
        return id;
    }

    // Static method to get the count of Employee instances
    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String toString() {
        return "Emp
    }
