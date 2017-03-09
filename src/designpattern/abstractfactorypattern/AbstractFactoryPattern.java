package designpattern.abstractfactorypattern;
/*Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
*/
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		AbstractFactory abstractFactory =  FactoryProducer.getFactory("vehicle");
		
		VehicleInterface interface1=abstractFactory .getVehicle("bike");
		interface1.vehicle();
		
		VehicleInterface interface2 = abstractFactory.getVehicle("car");
		interface2.vehicle();
		
		AbstractFactory abstractFactory2 = FactoryProducer.getFactory("company");
		
		CompanyInterface interface3 = abstractFactory2.getCompany("bajaj");
		interface3.company();
		
		CompanyInterface interface4 = abstractFactory2.getCompany("toyota");
		interface4.company();
	}

}
