package SpringBootInitialised.Controller;

import SpringBootInitialised.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "Harry"),
                new Course(2, "Azure", "Thapa"),
                new Course(3, "React", "Knoldus"),
                new Course(4, "React-Native", "Knoldus")
        );
    }
}
