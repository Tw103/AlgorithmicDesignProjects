// Te'Variyae Woods

public class CruiseShip extends Ship {

	 private int passengerCapacity;
	    private int crewMembers;

	    // Constructor
	    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewMembers) {
	        super(name, launchDate); // Call to parent constructor
	        this.passengerCapacity = passengerCapacity;
	        this.crewMembers = crewMembers;
	    }

	    // Accessor and Mutator methods
	    public int getPassengerCapacity() {
	        return passengerCapacity;
	    }

	    public void setPassengerCapacity(int passengerCapacity) {
	        this.passengerCapacity = passengerCapacity;
	    }

	    public int getCrewMembers() {
	        return crewMembers;
	    }

	    public void setCrewMembers(int crewMembers) {
	        this.crewMembers = crewMembers;
	    }

	    
	    public String toString() {
	        return "CruiseShip Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity +
	               "\nCrew Members: " + crewMembers;
	    }
	}