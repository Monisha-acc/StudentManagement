import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> studentMap = new HashMap<>();

        while (true) {
            System.out.println("\n📚 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Remove by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    studentMap.put(id, new Student(id, name, dept));
                    System.out.println(" Student added successfully!");
                    break;

                case 2:
                    if (studentMap.isEmpty()) {
                        System.out.println("⚠️ No students found.");
                    } else {
                        System.out.println("📋 All Students:");
                        for (Student s : studentMap.values()) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    if (studentMap.containsKey(searchId)) {
                        System.out.println("🔍 Found: " + studentMap.get(searchId));
                    } else {
                        System.out.println(" Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    if (studentMap.remove(removeId) != null) {
                        System.out.println(" Student removed.");
                    } else {
                        System.out.println(" No student found with this ID.");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting system. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }
}
