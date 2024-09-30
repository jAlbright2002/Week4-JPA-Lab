package ie.atu.week3taskmanagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskManagementController {

    @GetMapping
    public List<Task> getTasks() {
        return "";
    }

    @PostMapping
    public Task addTask() {
        return "";
    }

    @DeleteMapping
    public void removeTask() { }

    @PutMapping
    public Task updateTask() {
        return "";
    }

}
