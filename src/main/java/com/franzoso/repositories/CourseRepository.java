package com.franzoso.repositories;

import com.franzoso.entities.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CourseRepository implements ICourseRepository {

  final CourseJPARepository courseJPARepository;

  @Override
  public Course findByName(String name) {
    return this.courseJPARepository.findByName(name);
  }

  @Override
  public Course save(Course course) {
    return this.courseJPARepository.save(course);
  }

}
