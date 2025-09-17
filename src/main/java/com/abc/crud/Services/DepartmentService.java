package com.abc.crud.Services;

import com.abc.crud.Entity.Department;
import com.abc.crud.Reopositorys.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository){
        this.repository = repository;

    }

    public Department save(Department dept){
        return repository.save(dept);
    }

    public List<Department> findAll(){
        return repository.findAll();
    }

    public Optional<Department> findbyId(Long id){
        return repository.findById(id);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
