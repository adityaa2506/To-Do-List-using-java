import java.util.ArrayList;
import java.io.*;

class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private final String FILE_NAME = "tasks.txt";

    // Constructor: Load tasks from file when program starts
    ToDoList() {
        loadTasksFromFile();
    }

    // Add a task and save to file
    void addTask(String name, int priority) {
        tasks.add(new Task(name, priority));
        System.out.println("Task added: " + name);
        saveTasksToFile();
    }

    // View all tasks
    void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Delete a task and save updated list to file
    void deleteTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            Task removed = tasks.remove(index - 1);
            System.out.println("Task removed: " + removed.name);
            saveTasksToFile();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Save tasks to file
    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.name + "," + task.priority);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Load tasks from file
    private void loadTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int priority = Integer.parseInt(parts[1]);
                    tasks.add(new Task(name, priority));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing tasks file found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}