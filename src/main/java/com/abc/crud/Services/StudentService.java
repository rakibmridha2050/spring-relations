package com.abc.crud.Services;


import com.abc.crud.Entity.Student;

import com.abc.crud.Reopositorys.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public Student save(Student dept){
        return repository.save(dept);
    }

    public List<Student> findAll(){
        return repository.findAll();
    }

    public Optional<Student> findbyId(Long id){
        return repository.findById(id);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
