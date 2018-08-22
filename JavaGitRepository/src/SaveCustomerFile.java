import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class SaveCustomerFile {
	
	public static void saveFile(String fileName) {

		try {
			PrintWriter fileIn = new PrintWriter(fileName);

			Scanner customer = new Scanner(System.in);
			double id = customer.nextDouble();
			String name = customer.nextLine();
			String surname = customer.nextLine();
			int age = customer.nextInt();
			double salary = customer.nextDouble();

			fileIn.println(id);
			fileIn.println(name);
			fileIn.println(surname);
			fileIn.println(salary);

			fileIn.close();

		} catch (FileNotFoundException ex) {
			System.out.println("CAN'T CREATE NEW FILE");

		}
	}

	public static String readFile(String fileName) {

		File customerFile = new File(fileName);

		String read = "";
		try {
			Scanner putData = new Scanner(customerFile);
			while (putData.hasNextLine()) {
				read = read + putData.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
		}
		return read;
	}

}
