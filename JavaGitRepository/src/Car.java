import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

public class Car {
	public static void main(String[] args) throws Exception {

		// this is object first is class name next is name of new object

		SportCar Arrinera = new SportCar();

		Arrinera.color = "red";
		Arrinera.doors = 2;
		Arrinera.name = "Arrinera Hussarya";
		Arrinera.wheels = 4;

		SportCar Spyker = new SportCar();

		Spyker.color = "orange";
		Spyker.doors = 2;
		Spyker.name = "Spiker c8";
		Spyker.wheels = 4;

		Arrinera.run();

		System.out.println(Arrinera.name);
		System.out.println(Spyker.doors);

		new SportCar(2, 4, "red", "Laraki Epitome");
		new SportCar(4, 4, "white", "Aston Martine Rapide");
		new Parts();

	}
}

//this is class, something like pattern using for creating objects, in class  i can create object and add properties and methods

class SportCar {

	SportCar() {

		System.out.println("default constructor");
	}

	SportCar(int howManyDoors, int howManyWheels, String whatColor, String whatName) {
		System.out.println("constructor with four parameters");
		System.out.println("number of doors " + howManyDoors + " number of wheels " + howManyWheels + " car color "
				+ whatColor + " car name  " + whatName);
	}

	String color;
	String name;
	int doors;
	int wheels;

	void run() {
		if (true)
			System.out.println("start engine and run");
	}

}

class Parts {

	Parts() throws Exception {
		System.out.println("Write 'OK' if you wana add any special parts for Your car ");

		String showParts;
		Scanner takeParts = new Scanner(System.in);

		showParts = takeParts.nextLine();
		if (showParts.equals("OK"))
			System.out.println("Greate now lets add some Parts");
		else if (showParts.equals("ok"))
			System.out.println("Greate now lets add some Parts");
		else {
			System.out.println("c'mon take a new shiny parts for your car i feel like a King");

			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(750);
			System.out.print("..");
			Thread.sleep(1000);
			System.out.print("...");
			Thread.sleep(1500);
			System.out.print("....");
			

			System.out.println("Write 'OK' if you wana add any special parts for Your car ");
		}

		Scanner addParts = new Scanner(System.in);
		System.out.println("write what parts you need");

		String name = addParts.nextLine();
		double tmpName = name.length();
		double ID = tmpName / 3;
		double price = tmpName;

		System.out.println("Summary: parts name is - " + name);
		System.out.println("Summary: parts price is - " + price);
		System.out.println("Summary: parts ID is - " + ID);
	}

}
