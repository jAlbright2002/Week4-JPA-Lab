package ie.atu.week3taskmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week3TaskManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3TaskManagementApplication.class, args);
    }

}
