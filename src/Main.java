import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Vazifa qo'shish");
            System.out.println("2. Vazifalarni ko'rish");
            System.out.println("3. Chiqish");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Vazifa kiriting: ");
                String task = scanner.nextLine();
                tasks.add(task);

            } else if (choice == 2) {

                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }

            } else {
                break;
            }
        }
    }
}