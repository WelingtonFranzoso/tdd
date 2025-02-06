package com.franzoso.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Entity
@Table(name = "courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String description;

  private String name;

  private int workload;

}
