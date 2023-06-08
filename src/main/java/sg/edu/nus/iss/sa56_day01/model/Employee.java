package sg.edu.nus.iss.sa56_day01.model;

// no need to put this in exam
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// these replace the constructors and getter/setters, no need to type it out
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Employee {
    private String id;
    private String firstName;
    private String lastName;

}
