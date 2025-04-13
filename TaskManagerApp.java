import java.time.LocalDate;

public class TaskManagerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Task Manager!!!");
        System.out.println("----------------------------");

        // Test valid task
        Task validTask = new Task("ASGT 1", "OOP", LocalDate.now().plusDays(7), "High");
        System.out.println(validTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(validTask));
        System.out.println("----------------------------");

        // Test empty task name
        Task emptyNameTask = new Task("", "OOP", LocalDate.now().plusDays(7), "High");
        System.out.println(emptyNameTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(emptyNameTask));
        System.out.println("----------------------------");

        // Test empty category
        Task emptyCategoryTask = new Task("ASGT 1", "", LocalDate.now().plusDays(7), "Medium");
        System.out.println(emptyCategoryTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(emptyCategoryTask));
        System.out.println("----------------------------");

        // Test past due date
        Task pastDateTask = new Task("ASGT 1", "OOP", LocalDate.now().minusDays(1), "Low");
        System.out.println(pastDateTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(pastDateTask));
        System.out.println("----------------------------");

        // Test invalid priority
        Task invalidPriorityTask = new Task("ASGT 1", "OOP", LocalDate.now().plusDays(7), "Urgent");
        System.out.println(invalidPriorityTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(invalidPriorityTask));
        System.out.println("----------------------------");

        // Test complete task (all fields missing)
        Task emptyTask = new Task();
        System.out.println(emptyTask.toString());
        System.out.println("Validation Result: " + TaskValidator.validateTask(emptyTask));
    }
}

