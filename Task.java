import java.util.ArrayList;
import java.io.*;
class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }
}