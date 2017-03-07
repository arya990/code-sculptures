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
	String getName() {
		return "Cricket";
	}
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}
}

public class JavaMethodOverriding {

	public static void main(String[] args) {
		Sports sports=new Sports();
		Soccer soccer=new Soccer();
		Volleyball volleyball=new Volleyball();
		Cricket cricket= new Cricket();
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
