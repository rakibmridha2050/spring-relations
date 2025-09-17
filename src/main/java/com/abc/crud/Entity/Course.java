package com.abc.crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Course extends BaseEntity{
    private String name;

    @ManyToMany(mappedBy = "courses")

    private Set<Student> students = new HashSet<>();

}
