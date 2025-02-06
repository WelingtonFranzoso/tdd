package com.franzoso.controllers;

import com.franzoso.entities.Course;
import com.franzoso.repositories.CourseRepository;
import com.franzoso.services.CreateCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courses")
public class CourseController {

  private final CourseRepository repository;
  private final CreateCourseService createCourseService;

  @PostMapping("/")
  public Course createCourse(@RequestBody Course course) {
    return createCourseService.execute(course);
  }

}
