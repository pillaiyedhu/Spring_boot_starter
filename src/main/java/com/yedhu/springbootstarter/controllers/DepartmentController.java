package com.yedhu.springbootstarter.controllers;


import com.yedhu.springbootstarter.entity.Department;
import com.yedhu.springbootstarter.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    //the below method is to post a single department in the database

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    //the below method is to get all the data of department in the database

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    //the below method is to get department according to the id

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") int departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    //the below method is to delete the department by id
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") int departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully....";
    }

    //the below method is used to update the given record ... as per the id

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") int departmentId,@RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId,department);
    }

    //the below method is used to search department by department names.....
    // for this we need to create repository as there is no inbuilt method for this

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }


}
