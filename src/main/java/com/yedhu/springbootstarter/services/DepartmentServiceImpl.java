package com.yedhu.springbootstarter.services;


import com.yedhu.springbootstarter.entity.Department;
import com.yedhu.springbootstarter.exceptions.DepartmentNotFoundException;
import com.yedhu.springbootstarter.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{


    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(int departmentId) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(departmentId);
        if(department.isPresent()){
            return department.get();
        }
        else{
            throw new DepartmentNotFoundException("Department not found");
        }

    }

    @Override
    public void deleteDepartmentById(int departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(int departmentId, Department department) {
        Department newDep = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())){
            newDep.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())){
            newDep.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress())){
            newDep.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(newDep);

    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }


}
