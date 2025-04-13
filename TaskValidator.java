import java.time.LocalDate;

public class TaskValidator {
    public static String validateTask(Task task) {
        // Validate task name
        if (task.getTaskName() == null || task.getTaskName().trim().isEmpty()) {
            return "Task name cannot be empty!";
        }
        
        // Validate category
        if (task.getCategory() == null || task.getCategory().trim().isEmpty()) {
            return "Task category cannot be empty!";
        }
        
        // Validate due date
        if (task.getDueDate() == null) {
            return "Due date cannot be null!";
        }
        if (task.getDueDate().isBefore(LocalDate.now())) {
            return "Due date cannot be before today!";
        }
        
        // Validate priority
        if (task.getPriority() == null || task.getPriority().trim().isEmpty()) {
            return "Priority cannot be empty!";
        }
        if (!task.getPriority().equalsIgnoreCase("High") && 
            !task.getPriority().equalsIgnoreCase("Medium") && 
            !task.getPriority().equalsIgnoreCase("Low")) {
            return "Priority must be High, Medium, or Low!";
        }
        
        return "Task is valid.";
    }
}