package designpattern.factorypattern;

// vehicle object to generate object of concrete classes
public class VehicleObject {
	public VehicleInterface getVehicleInterface(String type) {
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		} else if ( type.equalsIgnoreCase("car")){
			return new Car();
		} 
		return null;
	}
}
