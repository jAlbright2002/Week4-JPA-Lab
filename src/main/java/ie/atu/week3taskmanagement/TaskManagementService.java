package ie.atu.week3taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagementService {

    private final FeignClient client;

    @Autowired
    public TaskManagementService(FeignClient client) {
        this.client = client;
    }

    private List<Task> taskList = new ArrayList<>();

    String notification;

    public List<Task> getTasks() {
        return taskList;
    }

    public void addTask(Task task) {
        taskList.add(task);
        notification = client.addedTask();
        System.out.println(notification);
    }

    public void updateTask(Task task, int id) {
        for (Task task1 : taskList) {
            if (task1.getId() == id) {
                task1.setTask(task.getTask());
                task1.setStatus(task.getStatus());
            }
        }
        notification = client.updatedTask();
        System.out.println(notification);
    }

    public void removeTask(int id) {
        taskList.removeIf(task -> task.getId() == id);
        notification = client.removedTask();
        System.out.println(notification);
    }

}
