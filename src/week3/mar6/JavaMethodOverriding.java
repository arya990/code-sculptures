package week3.mar6;

class Sports {
	String getName() {
		return "Generic Sports";
	}

	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Soccer extends Sports {
	@Override
	String getName() {
		return "Soccer";
	}

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in " + getName());
	}
}

class Volleyball extends Sports {
	@Override
	String getName() {
		return "Volleyball";
	}

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 6 players in " + getName());
	}
}

class Cricket extends Sports {

	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

public class JavaMethodOverriding {

	public static void main(String[] args) {
		Sports sports = new Sports();
		Soccer soccer = new Soccer();
		Volleyball volleyball = new Volleyball();
		Cricket cricket = new Cricket();
		System.out.println(sports.getName());
		sports.getNumberOfTeamMembers();
		System.out.println(soccer.getName());
		soccer.getNumberOfTeamMembers();
		System.out.println(volleyball.getName());
		volleyball.getNumberOfTeamMembers();
		System.out.println(cricket.getName());
		cricket.getNumberOfTeamMembers();

	}

}
/*
I would like to get the below output as mentioned in the question:
Generic Sports
Each team has n players in Generic Sports
Soccer
Each team has n players in Soccer
Volleyball
Each team has 6 players in Volleyball
Generic Sports
Each team has 11 players in Generic Sports

However, with the above code I'm getting below output which isn't what I expected:
Generic Sports
Each team has n players in Generic Sports
Soccer
Each team has n players in Soccer
Volleyball
Each team has 6 players in Volleyball
Cricket
Each team has 11 players in Cricket

Please make changes to the above code to display the desried output.

NOTE: You don't need to override every method if you're not willing to change the logic in the overridden method.
Only override the particular method whose logic you wish to change in the child class.
If you don't override a method in a child class, automatically it's parent class implementation for that method is called.
*/
