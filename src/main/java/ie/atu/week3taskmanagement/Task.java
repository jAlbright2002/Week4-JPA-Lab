package ie.atu.week3taskmanagement;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @PositiveOrZero(message = "ID must be 0 or more")
    private int id;
    @NotEmpty(message = "task must not be empty")
    private String task;
    @NotEmpty(message = "status must not be empty")
    private String status;
}
