import java.time.LocalDate;

/**
 * TaskValidator class provides validation logic for Task objects.
 */
public class TaskValidator {
    
    /**
     * Validates a task based on defined criteria
     * 
     * @param task the task to validate
     * @return a message indicating if the task is valid or describing the error
     */
    public static String validateTask(Task task) {
        // Check if task name is empty
        if (task.getTaskName() == null || task.getTaskName().trim().isEmpty()) {
            return "Error: Task name cannot be empty!";
        }
        
        // Check if category is empty
        if (task.getCategory() == null || task.getCategory().trim().isEmpty()) {
            return "Error: Category cannot be empty!";
        }
        
        // Check if due date is in the past
        if (task.getDueDate().isBefore(LocalDate.now())) {
            return "Error: Due date cannot be in the past!";
        }
        
        // Check if priority is valid
        String priority = task.getPriority();
        if (priority == null || !(priority.equals("High") || priority.equals("Medium") || priority.equals("Low"))) {
            return "Error: Priority must be 'High', 'Medium', or 'Low'!";
        }
        
        // If all checks pass, return valid
        return "Task is valid";
    }
}