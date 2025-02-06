package com.franzoso.repositories;


import com.franzoso.entities.Course;

public interface ICourseRepository {

  public Course findByName(String name);

  public Course save(Course course);

}
