package com.yedhu.springbootstarter.repository;

import com.yedhu.springbootstarter.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

    //this method is to find department by department name.......
    public Department findByDepartmentName(String departmentName);

    //this method is to find department by department name .. also can ignorecase
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
