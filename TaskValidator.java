public class TaskValidator {
    public static String validateTask(Task task) {
        if (task.getTaskName() == null || task.getTaskName().trim().isEmpty()) {
            return "Task cannot be empty!!!";
        }
        if (category.getCategory() == null || task.getCategory().trim().isEmpty()){
            return ""
        }
    }
}
