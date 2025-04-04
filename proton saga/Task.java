import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Task class represents a task with name, category, due date, and priority.
 */
public class Task {
    // Attributes
    private String taskName;
    private String category;
    private LocalDate dueDate;
    private String priority;
    
    /**
     * Default constructor - initializes a task with default values
     */
    public Task() {
        this.taskName = "";
        this.category = "";
        this.dueDate = LocalDate.now();
        this.priority = "Medium";
    }
    
    /**
     * Parameterized constructor - initializes a task with specified values
     * 
     * @param taskName the name of the task
     * @param category the category of the task
     * @param dueDate the due date of the task
     * @param priority the priority level of the task
     */
    public Task(String taskName, String category, LocalDate dueDate, String priority) {
        this.taskName = taskName;
        this.category = category;
        this.dueDate = dueDate;
        this.priority = priority;
    }
    
    // Getters and Setters
    
    /**
     * Gets the task name
     * @return the task name
     */
    public String getTaskName() {
        return taskName;
    }
    
    /**
     * Sets the task name
     * @param taskName the task name to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    
    /**
     * Gets the category
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * Sets the category
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    /**
     * Gets the due date
     * @return the due date
     */
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    /**
     * Sets the due date
     * @param dueDate the due date to set
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
    /**
     * Gets the priority
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }
    
    /**
     * Sets the priority
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    /**
     * Returns a string representation of the task
     * @return formatted task description
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Task: " + taskName + 
               "\nCategory: " + category + 
               "\nDue Date: " + dueDate.format(formatter) + 
               "\nPriority: " + priority;
    }
}