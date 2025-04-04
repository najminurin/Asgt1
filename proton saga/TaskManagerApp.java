import java.time.LocalDate;

/**
 * TaskManagerApp is the main application class to test Task and TaskValidator functionality.
 */
public class TaskManagerApp {
    
    /**
     * Main method - entry point of the application
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Task Management System");
        System.out.println("----------------------");
        
        // Create a valid task
        Task validTask = new Task(
            "Complete Java Assignment",
            "Assignment",
            LocalDate.now().plusDays(7), // Due date is 7 days from now
            "High"
        );
        
        // Create an invalid task (past due date)
        Task invalidDueDateTask = new Task(
            "Submit Project Proposal",
            "Project",
            LocalDate.now().minusDays(2), // Due date is 2 days ago (invalid)
            "Medium"
        );
        
        // Create an invalid task (empty task name)
        Task invalidNameTask = new Task(
            "",
            "Exam",
            LocalDate.now().plusDays(14),
            "High"
        );
        
        // Create an invalid task (invalid priority)
        Task invalidPriorityTask = new Task(
            "Study for Final Exam",
            "Exam",
            LocalDate.now().plusDays(30),
            "Urgent" // Invalid priority
        );
        
        // Test the valid task
        System.out.println("\nTesting Valid Task:");
        System.out.println(validTask);
        String validationResult = TaskValidator.validateTask(validTask);
        System.out.println("Validation Result: " + validationResult);
        
        // Test the invalid task with past due date
        System.out.println("\nTesting Invalid Task (Past Due Date):");
        System.out.println(invalidDueDateTask);
        validationResult = TaskValidator.validateTask(invalidDueDateTask);
        System.out.println("Validation Result: " + validationResult);
        
        // Test the invalid task with empty name
        System.out.println("\nTesting Invalid Task (Empty Name):");
        System.out.println(invalidNameTask);
        validationResult = TaskValidator.validateTask(invalidNameTask);
        System.out.println("Validation Result: " + validationResult);
        
        // Test the invalid task with invalid priority
        System.out.println("\nTesting Invalid Task (Invalid Priority):");
        System.out.println(invalidPriorityTask);
        validationResult = TaskValidator.validateTask(invalidPriorityTask);
        System.out.println("Validation Result: " + validationResult);
    }
}