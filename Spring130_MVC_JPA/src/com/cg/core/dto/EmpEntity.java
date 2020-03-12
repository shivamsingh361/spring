package com.cg.core.dto;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name="Emp")
public class EmpEntity {
    @Id
    @Column(name="empno")
    private int empId;
    @Column(name="ename")
    private String empName;
    @Column(name="sal")
    private float salary;
    public EmpEntity(int empId, String empName, float salary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    public int getEmpId() { 
        return empId;
    }

 

    public void setEmpId(int empId) {
        this.empId = empId;
    }

 

    public String getEmpName() {
        return empName;
    }

 

    public void setEmpName(String empName) {
        this.empName = empName;
    }

 

    public float getSalary() {
        return salary;
    }

 

    public void setSalary(float salary) {
        this.salary = salary;
    }

 

    public EmpEntity() {
        super();
    }
    @Override
    public String toString() {
        return "EmpEntity [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
    }
}
 