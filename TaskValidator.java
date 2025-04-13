public class TaskValidator {
    public static String validateTask(Task task) {
        if (task.getTaskName() == null || task.getTaskName().trim().isEmpty()) {
            return "Task name cannot be empty!";
        }
        if (task.getCategory() == null || task.getCategory().trim().isEmpty()) {
            return "Task category cannot be empty!";
        }
        
        return "Task is valid.";
    }
}
