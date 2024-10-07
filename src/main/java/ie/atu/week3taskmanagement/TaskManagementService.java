package ie.atu.week3taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskManagementService {

    private TaskRepository taskRepo;

    @Autowired
    public TaskManagementService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }


    public List<Task> getTasks() {
        return taskRepo.findAll();
    }

    public void addTask(Task task) {
        taskRepo.save(task);
    }

    public void updateTask(Long id, Task task) {
        Task updatedTask = taskRepo.getReferenceById(id);
        updatedTask.setTask(task.getTask());
        updatedTask.setStatus(task.getStatus());
        taskRepo.save(updatedTask);
    }

    public void removeTask(Long id) {
        taskRepo.deleteById(id);
    }

}
