public class Car {
	public static void main(String[] args) {

		SportCar Arrinera = new SportCar();
		Arrinera.color = "red";
		Arrinera.doors = 2;
		Arrinera.name = "Arrinera";
		Arrinera.wheels = 4;

		SportCar Spyker = new SportCar();
		Spyker.color = "red";
		Spyker.doors = 2;
		Spyker.name = "Arrinera";
		Spyker.wheels = 4;

		Arrinera.run();

		System.out.println(Arrinera.name);
		System.out.println(Spyker.doors);

	}
}

class SportCar {
	String color;
	String name;
	int doors;
	int wheels;

	void run() {
	}
}
