import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveCustomerFile {
	 public static void main(String[] args) {
	
		 System.out.println("Give the file name");
	
	Scanner giveFileName = new Scanner(System.in);
	String fileName = giveFileName.nextLine();
	
	saveFile(fileName + ".txt");
	String fileToRead = readFile(fileName);
	
	System.out.println("Customer Info: \n" + fileToRead);
	
	 }
	
	public static void saveFile(String fileName) {

		try {
			System.out.println("Create new file");
			
			PrintWriter fileIn = new PrintWriter(fileName);
			Scanner customer = new Scanner(System.in);
			
			System.out.println("ID");
			double id = customer.nextDouble();
			
			System.out.println("Name");
			String name = customer.nextLine();
			
			System.out.println("Surname");
			String surname = customer.nextLine();
			
			System.out.println("Age");
			int age = customer.nextInt();
			
			System.out.println("Salary");
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
