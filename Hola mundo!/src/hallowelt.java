import java.util.Scanner;

public class hallowelt {

	public static void main(String[] args) {
		System.out.println("I can calculate the area of a circle for any number that you give me. Enter your number below.");
		int i=6;
		Scanner scanner = new Scanner(System.in);
		while(i>0) {
		double radius = scanner.nextDouble();
		double area = (Math.PI * radius*radius);
		double circumference = (Math.PI * radius * 2);
		double roundOffR = Math.round(area * 100.0) / 100.0;
		double roundOffC = Math.round(circumference * 100.0) / 100.0;
System.out.println("The area of a circle with a radius of " + radius +" meters is " + roundOffR + " meters squared.");
System.out.println("The circumference is "+ roundOffC + " meters.");
i++;
System.out.println("Please enter a new number.");
		}
		scanner.close();
	}

}
