package com.knoldus.SpringBoot_JPA.course.jdbc;

import com.knoldus.SpringBoot_JPA.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;




    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "native", "harry"));
        courseJdbcRepository.insert(new Course(2, "react", "thapa"));
        courseJdbcRepository.insert(new Course(3, "aws", "harry"));
        courseJdbcRepository.insert(new Course(4, "java", "java brains"));

        System.out.println("Deleting Course");

        courseJdbcRepository.delete(3);

    }
}
