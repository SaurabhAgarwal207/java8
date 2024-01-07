package com.saurabh.streamApi;

public class Employee {
    private int employeeNo;
    private String employeeName;
    private int employeeSalary;

    public Employee(int employeeNo, String employeeName, int employeeSalary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo=" + employeeNo +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
