package com.franzoso.repositories;

import com.franzoso.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseJPARepository extends JpaRepository<Course, UUID> {

  Course findByName(String name);

}
