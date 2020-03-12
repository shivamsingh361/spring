package com.cg.core.dto;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name="Emp")
public class EmpEntity {
    @Id
    @Column(name="empNo")
    private int empNo;
    @Column(name="ename")
    private String empName;
    @Column(name="sal")
    private float salary;
    public EmpEntity(int empNo, String empName, float salary) {
        super();
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }
    


    public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
        return "EmpEntity [empId=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
    }
}
 