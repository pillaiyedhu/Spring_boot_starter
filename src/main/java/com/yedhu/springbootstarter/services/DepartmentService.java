package com.yedhu.springbootstarter.services;


import com.yedhu.springbootstarter.entity.Department;
import com.yedhu.springbootstarter.exceptions.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDepartments();

    public Department getDepartmentById(int departmentId) throws DepartmentNotFoundException;


    public void deleteDepartmentById(int departmentId);

    public Department updateDepartmentById(int departmentId,Department department);

    public Department getDepartmentByName(String departmentName);
}
