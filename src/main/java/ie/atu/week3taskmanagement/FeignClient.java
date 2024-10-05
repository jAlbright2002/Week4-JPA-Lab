package ie.atu.week3taskmanagement;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "TaskNotification", url = "http://task-notification:8081")
public interface FeignClient {

    @GetMapping("/updated")
    String updatedTask();

    @GetMapping("/removed")
    String removedTask();

    @GetMapping("/added")
    String addedTask();

}
