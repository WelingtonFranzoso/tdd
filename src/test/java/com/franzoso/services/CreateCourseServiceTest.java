package com.franzoso.services;


import com.franzoso.entities.Course;
import com.franzoso.repositories.CourseInMemoryRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateCourseServiceTest {

    @Test
    void should_be_able_to_create_a_new_course() {
        Course course = new Course();
        course.setDescription("Curso_Description_Test");
        course.setName("Curso_Name");
        course.setWorkload(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();
        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);

        assertNotNull(createdCourse.getId());

    }

    @Test
    void should_not_be_able_to_create_a_new_course_if_exists() {
        Course course = new Course();
        course.setDescription("Not_Create_course");
        course.setName("Not_Create_course");
        course.setWorkload(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();
        CreateCourseService createCourseService = new CreateCourseService(repository);

        createCourseService.execute(course);
    }

}
