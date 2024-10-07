package ie.atu.week3taskmanagement;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskManagementController {

    private final TaskManagementService service;

    @Autowired
    public TaskManagementController(TaskManagementService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Task> getTasks() {
        return service.getTasks();
    }

    @PostMapping("/add")
    public Task addTask(@Valid @RequestBody Task task) {
        service.addTask(task);
        return task;
    }

    @DeleteMapping("/remove/{id}")
    public void removeTask(@Valid @PathVariable Long id) {
        service.removeTask(id);
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@Valid @PathVariable Long id, @Valid @RequestBody Task task) {
        service.updateTask(id, task);
        return task;
    }

}
