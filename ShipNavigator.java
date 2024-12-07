// Te'Variyae Woods

import java.util.Scanner;

public class ShipNavigator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String continueCreating;
        
        do {
        	System.out.println("Welcome to the Ship Navigator ;)");
            System.out.println("Enter the name of the ship:");
            String shipName = scanner.nextLine();
            
            System.out.println("Enter the ships launch date in the following format. (mm/dd/yyyy):");
            String launchDate = scanner.nextLine();
            
            System.out.println("Is it a cruise ship or cargo ship? ");
            String shipType = scanner.nextLine().toLowerCase();

            if (shipType.equals("cruise ship")) {
                System.out.println("What is the ship's passenger capacity?");
                int passengerCapacity = Integer.parseInt(scanner.nextLine());
                
                System.out.println("How many crew members are on this ship?");
                int crewMembers = Integer.parseInt(scanner.nextLine());

                CruiseShip cruiseShip = new CruiseShip(shipName, launchDate, passengerCapacity, crewMembers);
                System.out.println("Creating a cruise ship for you ma boy...");
                System.out.println(cruiseShip);
            } else if (shipType.equals("cargo ship")) {
                System.out.println("Enter the ship's tonnage (DWT):");
                double tonnage = Double.parseDouble(scanner.nextLine());
                
                System.out.println("Enter the maximum speed of the ship (in mph):");
                double maxSpeed = Double.parseDouble(scanner.nextLine());

                CargoShip cargoShip = new CargoShip(shipName, launchDate, tonnage, maxSpeed);
                System.out.println("Creating a cargo ship for you my good kind sir...");
                System.out.println(cargoShip);
            } else {
                System.out.println("Invalid ship type! Please enter 'cruise ship' or 'cargo ship'.");
            }

            System.out.println("Do you want to construct another ship? Enter yes or no. ^_^");
            continueCreating = scanner.nextLine();

        } while (continueCreating.equalsIgnoreCase("yes"));

        System.out.println("Have a good day, goodbye! ^_~");
        scanner.close();
		
	}

}
