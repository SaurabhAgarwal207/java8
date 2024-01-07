package com.saurabh.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"saurabh",5000));
        employee.add(new Employee(2,"radhe",15000));
        employee.add(new Employee(3,"mohan",25000));
        employee.add(new Employee(2,"pyare",3000));
        employee.add(new Employee(4,"jaadu",11000));
        //display employee names salary greater that 10000
        employee.stream().filter(x->x.getEmployeeSalary()>10000).forEach(x-> System.out.println(x.getEmployeeName()));
        //get count of employee having salary greater than 10000
        long count = employee.stream().filter(x -> x.getEmployeeSalary() > 10000).count();
        System.out.println("Count : "+count);
        //Find employee details with highest salary
        Employee empMaxSal = employee.stream().max(Comparator.comparingInt(Employee::getEmployeeSalary)).get();
        System.out.println(empMaxSal);
        //Employee salary lowest
        Employee empLessSal=employee.stream().min(Comparator.comparingInt(Employee::getEmployeeSalary)).get();
        System.out.println(empLessSal);
        //Employee details ascending order
        employee.stream().sorted(Comparator.comparingInt(Employee::getEmployeeNo)).forEach(x-> System.out.print(x+" --- "));
        System.out.println();
        //Employee details sorted descending
        List<Employee> descSortedEmployee = employee.stream().sorted(Comparator.comparingInt(Employee::getEmployeeNo).reversed()).collect(Collectors.toList());
        System.out.println(descSortedEmployee);
    }
}
