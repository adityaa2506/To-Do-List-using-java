# Java To-Do List

A console-based To-Do List application built in Java. Manage tasks using `ArrayList` and save them persistently in `tasks.txt`. Perfect for learning Java's OOP, collections, and file handling.

## Features
- Add tasks with name and priority (1-5).
- View all tasks with indices.
- Delete tasks by index.
- Tasks saved to `tasks.txt` for persistence.

## Tech Stack
- **Java**: Core programming language.
- **ArrayList**: Dynamic storage for tasks.
- **File I/O**: `BufferedWriter`/`BufferedReader` for saving/loading tasks.

## Setup
1. Clone the repo:
   ```bash
   git clone https://github.com/adityaa2506/To-Do-List-using-java.git
   cd To-Do-List-using-java
   ```
2. Compile and run:
   ```bash
   javac Main.java
   java Main
   ```

## Usage
- Menu options: Add (1), View (2), Delete (3), Exit (4).
- Tasks saved in `tasks.txt` (format: `name,priority`, e.g., `Study Java,3`).
- Example:
  ```
  1. Add Task
  2. View Tasks
  3. Delete Task
  4. Exit
  Choose an option: 1
  Enter task name: Study Java
  Enter priority (1-5): 3
  Task added: Study Java
  ```

## Code Structure
- `Main.java`:
  - `Task` class: Stores task name and priority.
  - `ToDoList` class
