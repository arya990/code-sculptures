package week3.feb27;

import java.util.Scanner;
/*Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly  decimal places.
In case any of the dimensions of the figures are , print "java.lang.NumberFormatException: All the values must be positive" without quotes and terminate the program.
*/ 
public class ProgramonOOPS {

	public static void cube(double side) {
		double cube_volume = Math.round((side * side * side) * 1000);
		System.out.println("volume of cube is :" + cube_volume/1000);
	}

	public static void cuboid(double length, double breadth, double height) {
		double cuboid_volume = Math.round((length * breadth * height) * 1000);
		System.out.println("volume of cuboid:" + cuboid_volume/1000);
	}

	public static void hemisphere(double radius) {
		double hemisphere_volume = Math.round((2 * Math.PI * Math.pow(radius, 3)) * 1000);
		System.out.println("volume of hemisphere is: " + hemisphere_volume/1000);
	}

	public static void cylinder(double radius, double height) {
		double cylinder_volume = Math.round((Math.PI * Math.pow(radius, 2) * height) * 1000);
		System.out.println("volume of cylinder is: " + cylinder_volume/1000);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter 1 to enter cube length");
		System.out.println("enter 2 to enter length,breadth,height of cuboid");
		System.out.println("enter 3 to enter radius of hemisphere");
		System.out.println("enter 4 to enter radius and height on cylinder");

		String input = in.nextLine();
		int ch = Integer.parseInt(input);
		if (ch < 0) 
		{
			throw new NumberFormatException ("NumberFormatException");
		}
		
		 else {
			switch (ch) {
			case 1:
				System.out.println("Enter the length of side of cube:");
				double cube_length = in.nextDouble();
				if (cube_length < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				
				cube(cube_length);
				break;
			case 2:
				System.out.println("enter length of cuboid:");
				double cuboid_length = in.nextDouble();
				if (cuboid_length < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				System.out.println("enter breadth of cuboid:");
				double cuboid_breadth = in.nextDouble();
				if ( cuboid_breadth< 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				System.out.println("enter height of cuboid:");
				double cuboid_height = in.nextDouble();
				if (cuboid_height < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				cuboid(cuboid_length, cuboid_breadth, cuboid_height);
				break;
			case 3:
				System.out.println("Enter the radius of hemisphere:");
				double hemisphere_radius = in.nextDouble();
				if (hemisphere_radius < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				hemisphere(hemisphere_radius);
				break;
			case 4:
				System.out.println("enter radius of cylinder:");
				double cylinder_radius = in.nextDouble();
				if (cylinder_radius < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				System.out.println("enter height if cylinder:");
				double cylinder_height = in.nextDouble();
				if (cylinder_height < 0) 
					throw new NumberFormatException ("NumberFormatException");
				
				cylinder(cylinder_radius, cylinder_height);
			default:
				break;
			}
		}
		in.close();
	}

}
