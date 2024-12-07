// Te'Variyae Woods

public class Ship {
    private String name;
    private String launchDate; // Format: mm/dd/yyyy

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        setLaunchDate(launchDate); // Using the mutator
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchDate(String launchDate) {
        // Validate that the launch date is within 1990-2019
        if (isValidLaunchDate(launchDate)) {
            this.launchDate = launchDate;
        } else {
            System.out.println("Error: Launch date not within 1990-2019. Resetting to default date 01/01/1990.");
            this.launchDate = "01/01/1990"; // default date
        }
    }

    private boolean isValidLaunchDate(String launchDate) {
        // Split the date to extract the year
        String[] parts = launchDate.split("/");
        int year = Integer.parseInt(parts[2]);
        return year >= 1990 && year <= 2019;
    }

    
    public String toString() {
        return "Ship Name: " + name + "\nLaunch Date: " + launchDate;
    }
}