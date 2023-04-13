package MoreExercises.companyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private List<Employee> employees;

//    public Department(String name, List<Employee> employeeList) {
//        this.name = name;
//        this.employees = employeeList;
//    }

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Department that = (Department) o;
//        return name.equals(that.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public double calculateAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        employees.sort(Comparator.comparing(Employee::getSalary));
        sb.append("Highest Average Salary: ").append(name).append("\n");
        for (Employee employee : employees) {
            sb.append(String.format("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
        }
        return sb.toString();
    }

}
