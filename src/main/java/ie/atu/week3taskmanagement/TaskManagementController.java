package ie.atu.week3taskmanagement;

import org.springframework.web.bind.annotation.*;

@RestController
public class TaskManagementController {

    @GetMapping
    public String getTasks() {
        return "";
    }

    @PostMapping
    public String addTask() {
        return "";
    }

    @DeleteMapping
    public String removeTask() {
        return "";
    }

    @PutMapping
    public String updateTask() {
        return "";
    }

}
