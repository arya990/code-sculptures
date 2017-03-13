package designpattern.factorypattern;

/**
 * @author basha
 *
 */
// In Factory pattern, we create object without exposing the creation logic to
// the client and refer to newly created object using a common interface.

public class FactoryPattern {

	public static void main(String[] args) {
		VehicleObject vehicleObject = new VehicleObject();

		VehicleInterface vehicleInterface1 = vehicleObject.getVehicleInterface("bike");
		vehicleInterface1.vehicle();

		VehicleInterface vehicleInterface2 = vehicleObject.getVehicleInterface("car");
		vehicleInterface2.vehicle();
	}

}
