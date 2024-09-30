package ie.atu.week3taskmanagement;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "Task Management", url = "http://localhost:8081/")
public interface FeignClient {

    @GetMapping("/test")
    String test();

}
