package ie.atu.week3taskmanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagementService {

    private List<Task> taskList = new ArrayList<>();

    public List<Task> getTasks() {
        return taskList;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void updateTask(Task task, int id) {
        for (Task task1 : taskList) {
            if (task1.getId() == id) {
                task1.setTask(task.getTask());
                task1.setStatus(task.getStatus());
            }
        }
    }

    public void removeTask(int id) {
        taskList.removeIf(task -> task.getId() == id);
    }

}
