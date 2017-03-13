package designpattern.abstractfactorypattern;

public abstract class AbstractFactory {
	abstract VehicleInterface getVehicle(String vehicle);

	abstract CompanyInterface getCompany(String company);
}
