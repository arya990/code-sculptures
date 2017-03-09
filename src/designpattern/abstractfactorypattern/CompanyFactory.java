package designpattern.abstractfactorypattern;

public class CompanyFactory extends AbstractFactory {
	@Override
	VehicleInterface getVehicle(String type) {
		return null;
	}

	@Override
	public CompanyInterface getCompany(String type) {
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("toyota")) {
			return new Toyota();
		} else if (type.equalsIgnoreCase("bajaj")) {
			return new Bajaj();
		}
		return null; 
	}
}
