import java.time.LocalDate;

public class TaskManagerApp{
    public static void main(String[] args) {
        System.out.println("Welcome to Task Manager!!!");
        System.out.println("----------------------------");
        Task testTask = new Task("ASGT 1" , "OOP" , LocalDate.now().plusDays(7),"High");
        System.out.println(testTask.toString());
    }
}