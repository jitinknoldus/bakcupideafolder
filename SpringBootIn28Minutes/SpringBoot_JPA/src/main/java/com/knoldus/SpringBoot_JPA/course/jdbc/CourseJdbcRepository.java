package com.knoldus.SpringBoot_JPA.course.jdbc;

import com.knoldus.SpringBoot_JPA.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;


    private static String INSERT_QUERY =
            """
            insert into course values(?,?,?);
            """;

    private static String DELETE_QUERY =
            """
            delete from course where id = ?;
                    """;

    private static String GET_QUERY =
            """
            select * from course where id = ?;
                    """;


    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }

    public void getCourse(long id){
        springJdbcTemplate.query(GET_QUERY,null,id)
    }


}
