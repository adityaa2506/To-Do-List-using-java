import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Delete Task\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter priority (1-5): ");
                    int priority = scanner.nextInt();
                    toDoList.addTask(name, priority);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int index = scanner.nextInt();
                    toDoList.deleteTask(index);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}