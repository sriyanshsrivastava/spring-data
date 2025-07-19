package com.sriyansh.jpa.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor // lombok annotation it generates no argument constructor automatically.
@Entity         //tells spring boot that it is a entity
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "first_name",length = 35) // length will restrict first name length to 35 or less than 35.
    private String firstName;

    @Column(name="last_name")
    private String lastname;

    @Column(unique = true, nullable = false) // specifies mapped columns only contains unique emails
    private String email;

    @Column(nullable = false)
    private int age;

    @Column(updatable = false,nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
