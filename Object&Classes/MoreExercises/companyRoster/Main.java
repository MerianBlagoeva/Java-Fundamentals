package MoreExercises.companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        List<Department> departments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] info = input.split(" ");
            String name = info[0];

            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String departmentName = info[3];

            Department department = new Department(departmentName);
            Employee employee = new Employee(name, salary, position, department);

            if (!departments.contains(department)) {
                departments.add(department);
            }

            int age = -1;
            String email = "n/a";
            if (info.length == 5) {
                try {
                    Integer.parseInt(info[4]);
                } catch (NumberFormatException e) {
                    email = info[4];
                }
            }

            if (info.length == 6) {
                age = Integer.parseInt(info[5]);
            }
            employee.setEmail(email);
            employee.setAge(age);
            department.getEmployees().add(employee);

        }
        Department department = departments.stream().max(Comparator.comparingDouble(Department::calculateAverageSalary)).get();
        System.out.println(department.getName());

        System.out.printf("Highest Average Salary: %s%n", department.getName());
        for (Employee employee : department.getEmployees()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }


    }
}
