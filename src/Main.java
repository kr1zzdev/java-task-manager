import model.Task;
import service.TaskService;

public class Main {

    public static void main(String[] args) {

        TaskService service = new TaskService();

        Task t1 = new Task(1, "Study Java");
        Task t2 = new Task(2, "Build portfolio project");

        service.addTask(t1);
        service.addTask(t2);

        System.out.println("Tasks:");
        service.listTasks().forEach(t ->
                System.out.println(t.getId() + " - " + t.getTitle())
        );
    }

}
