package week3.feb27;

import java.util.Scanner;
/*Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly  decimal places.
In case any of the dimensions of the figures are , print "java.lang.NumberFormatException: All the values must be positive" without quotes and terminate the program.
*/
public class ProgramonOOPS {
	
	public static void cube(double side)
	{
		double cube_volume=Math.round(side*side*side);
		System.out.println("volume of cube is :"+cube_volume);
	}
	public static void cuboid(double length,double breadth,double height)
	{
		double cuboid_volume=Math.round(length*breadth*height);
		System.out.println("volume of cuboid:"+cuboid_volume);
	}
	public static void hemisphere(double radius)
	{
		double hemisphere_volume=Math.round(2*Math.PI*Math.pow(radius, 3));
		System.out.println("volume of hemisphere is: "+hemisphere_volume);
	}
	public static void cylinder(double radius,double height)
	{
		double cylinder_volume=Math.round(Math.PI*Math.pow(radius, 2)*height);
		System.out.println("volume of cu=ylider is: "+cylinder_volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter 1 to enter cube length");
		System.out.println("enter 2 to enter length,breadth,height of cuboid");
		System.out.println("enter 3 to enter radius of hemisphere");
		System.out.println("enter 4 to enter radius and height on cylinder");

		
		int ch=in.nextInt();
		switch (ch)
		{
		case 1: System.out.println("Enter the length of side of cube:");
				double cube_length=in.nextDouble();
				cube(cube_length);
		break;
		case 2:
			System.out.println("enter length of cuboid:");
			double cuboid_length=in.nextDouble();
			System.out.println("enter breadth of cuboid:");
			double cuboid_breadth=in.nextDouble();
			System.out.println("enter height of cuboid:");
			double cuboid_height=in.nextDouble();
			cuboid(cuboid_length,cuboid_breadth,cuboid_height);
		break;
		case 3: 
			System.out.println("Enter the radius of hemisphere:");
			double hemisphere_radius=in.nextDouble();
			hemisphere(hemisphere_radius);
		break;
		case 4:
			System.out.println("enter radius of cylinder:");
			double cylinder_radius=in.nextDouble();
			System.out.println("enter height if cylinder:");
			double cylinder_height=in.nextDouble();
			cylinder(cylinder_radius,cylinder_height);
		default: break;
		}
		in.close();
	}

}
/*
For handling negative or decimal inputs, place the below code in place of Line#39:
String input = in.nextLine(); //Accept the user input as String and later we can convert it into Integer
int ch = Integer.parseInt(input); //This line throws NumberFormatException, if the number has bad characters
if (ch < 0) //Explicitly throw NumberFormatException with the message
else //Continue your logic


Rounding to 3 digits:
Please use Math.round() method to round the decimal to nearest integer.
But for rounding it to 3 digits after decimals, multiply the number with 1000.0 and divide it with 1000.0 as below:
Ex:
double d = 2.345732;
System.out.println(Math.round(d * 1000.0)/1000.0);
Output:
2.346
*/
