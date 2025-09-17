package com.abc.crud.Controller;

import com.abc.crud.Entity.Department;
import com.abc.crud.Services.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service){
        this.service = service;

    }

    @PostMapping
    public Department create(@Valid @RequestBody Department dept){
        return service.save(dept);
    }

    @GetMapping
    public List<Department>getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id, @Valid @RequestBody Department dept){
        dept.setId(id);
        return service.findbyId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @Valid @RequestBody Department dept){
        dept.setId(id);
        return service.save(dept);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }
}
