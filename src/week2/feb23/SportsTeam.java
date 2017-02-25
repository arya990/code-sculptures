package week2.feb23;

//inheritance of a Sports class
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
		return "Soccer Class";
	}

	void getNumberOfTeamMembers() {

		System.out.println("Each team has 11 players in " + getName());
	}
}

public class SportsTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports s = new Sports();
		s.getName();
		s.getNumberOfTeamMembers();

		Soccer so = new Soccer();
		so.getName();
		so.getNumberOfTeamMembers();
	}

}
