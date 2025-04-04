#### Title
“Implementing Task Management with Exception Handling”

### Learning Outcome
- CLO2: Implement object-oriented programming systems to address a variety of computing-related challenges, demonstrating problem-solving skills.

### Objective
Apply object-oriented programming (OOP) principles in Java by designing and implementing a task management system. You will create multiple classes to manage tasks while implementing exception handling logic.  

---

## Instructions

### Part 1: UML Diagram (use mermaid code for all the diagram)
1. Design a UML Class Diagram that represents the following classes:
   - Task Class: Stores task details.
   - TaskValidator Class: Handles input validation.
   - TaskManagerApp Class: Application to test the classes.
2. Ensure the UML diagram clearly defines attributes, methods, and relationships between the classes.
3. Provide a suitable description for each UML class diagram.

### Part 2: Implement the Classes

#### 1. Task Class (`Task.java`)
- Attributes:
  - taskName (String) - Name of the task.
  - category (String) - Type of task (e.g., "Assignment", "Exam").
  - dueDate (LocalDate) - The deadline for the task.
  - priority (String) - Can be "High", "Medium", or "Low".
- Methods & Constructors:
  - Implement getters and setters for all attributes.
  - Include two constructors:
    - Default constructor: No parameters.
    - Parameterized constructor: Accepts values for all attributes.
  - Implement a toString() method to return a formatted task description.

#### 2. Exception Handling (`TaskValidator.java`)
- TaskValidator Class:
  - Create a class with a method:
       public static String validateTask(Task task)
    - Validation Checks:
  - Task name cannot be empty.
  - Category cannot be empty.
  - Due date cannot be in the past. *(Tip: Use isBefore() to check if the selected date is earlier than today’s date.)*
  - Priority must be "High", "Medium", or "Low" (other values are not allowed).
- Return Values:
  - If validation fails, return an error message (e.g., "Error: Task name cannot be empty!").
  - If the task is valid, return "Task is valid".

#### 3. Application Class (`TaskManagerApp.java`)
- TaskManagerApp Class:
  - Create a class with a main() method.
- Inside `main()`:
  - Create and test multiple task objects:
    - Create at least two tasks (one valid and one invalid).
    - Call TaskValidator.validateTask(task) and print the error message or confirmation.

---