package designpattern.abstractfactorypattern;

public class VehicleFactory extends AbstractFactory {
	@Override
	public VehicleInterface getVehicle(String type) {
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("bike")) {
			return new Bike();
		} else if (type.equalsIgnoreCase("car")) {
			return new Car();
		}
		return null;
	}

	@Override
	CompanyInterface getCompany(String type) {
		return null;
	}
}
