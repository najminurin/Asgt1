
import java.time.LocalDate;
public class Task{
    private String taskName ;
    private String category;
    private LocalDate dueDate ;
    private String priority;

    public Task(){
       taskName = " ";
       category = " ";
       dueDate = null ;
       priority = " ";
    }

    public Task(String taskName , String category , LocalDate dueDate , String priority){
         this.taskName = taskName;
         this.category = category;
         this.dueDate = dueDate;
         this.priority = priority;
    }

    //getter

    public String getTaskName(){
        return taskName;
    }
    public String getCategory(){
        return category;
    }
    public LocalDate getDueDate(){
        return dueDate;
    }
    public String getPriority(){
        return priority;
    }

    // setter

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

    public String toString(){
      return "Task Name: " + taskName + "\n" +
               "Category: " + category + "\n" +
               "Due Date: " + dueDate + "\n" +
               "Priority: " + priority + "\n";
    }
}
