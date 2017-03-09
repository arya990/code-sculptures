package designpattern.abstractfactorypattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("vehicle")) {
			return new VehicleFactory();
		} else if (choice.equalsIgnoreCase("company")) {
			return new CompanyFactory();
		}
		return null;
	}
}
