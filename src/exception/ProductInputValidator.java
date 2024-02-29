package exception;
import java.util.*;
public class ProductInputValidator {
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
    private static ArrayList<String> idList = new ArrayList<>();

    public static String getStringInput1(String prompt) {
        String id = null;
        Scanner scanner = new Scanner(System.in);

        while (id == null || idList.contains(id)) {
            System.out.print(prompt);
            id = scanner.nextLine();
            if (idList.contains(id)) {
                System.out.println("ID already exists. Please enter a new ID.");
            }
        }

        idList.add(id);
        return id;
    }
    public static double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid double value.");
            }
        }
    }

    public static int getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}

