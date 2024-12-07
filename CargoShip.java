// Te'Variyae Woods

public class CargoShip extends Ship {

	private double tonnage; //DWT
	private double maxSpeed; // mph
	
	//Constructor
	public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate); // Call to parent constructor
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
	}
	
	// Accessor and Mutator methodS
	public double getTonnage() {
		return tonnage;
	}
	
	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return "CargoShip Name: " + getName() + "\ntonnage: " + tonnage + "DWT" + "\nMaximum Speed: " + maxSpeed + "mph";
		}
	}

	
	