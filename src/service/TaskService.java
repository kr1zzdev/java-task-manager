package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> listTasks() {
        return tasks;
    }

    public boolean removeTaskById(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }
}
