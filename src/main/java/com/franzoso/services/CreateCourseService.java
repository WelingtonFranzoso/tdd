package com.franzoso.services;

import com.franzoso.entities.Course;
import com.franzoso.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {

  private ICourseRepository repository;

  public CreateCourseService(ICourseRepository repository) {
    this.repository = repository;
  }

  public Course execute(Course course) {

    Course existedCourse = this.repository.findByName(course.getName());

    if (existedCourse != null) {
      throw new RuntimeException("Course already exists in the database!");
    }

    return this.repository.save(course);

  }

}
