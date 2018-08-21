import java.util.Scanner;

public class CustomerType {
	CustomerType() {

		System.out.println("Tell us something about YOU");

	}

	void addCustomer(String name, int age, double monthlyIncome, double costStructure, boolean creditworthiness) {

		Scanner customerScanner = new Scanner(System.in);

		System.out.println("whats you Name");
		name = customerScanner.nextLine();

		System.out.println("how old are you");
		age = customerScanner.nextInt();

		System.out.println("how big is your salary");
		monthlyIncome = customerScanner.nextDouble();

		System.out.println("cost of life");
		costStructure = customerScanner.nextDouble();

		if ((monthlyIncome - costStructure) > (monthlyIncome / 2)) {
			creditworthiness = true;
			System.out.println("So if You are not a NINJA We have pretty new Car for You");

		}

	}
}
