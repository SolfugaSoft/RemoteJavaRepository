import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello GIT");
		System.out.println("And now i can pushing code to remote repository");

		String[] messagePossitiveList = { "Faster", "More", "Try Harder", "You must be quicker", "More Code more Money",
				"Maybe you should learn Python", "A lot of Bubbles it's so good",
				"You're more productive than your parents", };

		for (int i = 0; i < messagePossitiveList.length; i++) {
			System.out.println(messagePossitiveList[i]);
			/*
			 * for(string randomName : messagePossitiveList) {
			 * System.out.println(randomName); }
			 * 
			 */

		}

		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				if (i == 4)
					break;
				System.out.print(i * j + " ");

			}
			System.out.println();
		}
		System.out.println("end");

		int[] numbers = { 1, 12, 41, 12, 51, 12 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);

		String name;
		name = "Almondo";

		System.out.println(name.length());

	}

}
