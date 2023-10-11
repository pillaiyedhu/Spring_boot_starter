package com.yedhu.springbootstarter.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentAddress(){
        return departmentAddress;
    }

    public void setDepartmentCode(String departmentCode){
        this.departmentCode = departmentCode;
    }

    public String getDepartmentCode(){
        return departmentCode;
    }

    public Department(int departmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
