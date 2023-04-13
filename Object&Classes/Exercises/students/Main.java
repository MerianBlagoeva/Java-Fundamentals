package Exercises.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a program that receives n count of students and orders them by
        grade (in descending). Each student should have a first name (string), last name (string), and grade (a floating-point number).
         */

        int n = Integer.parseInt(sc.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String studentInfo = sc.nextLine();
            String[] infoParts = studentInfo.split("\\s+");
            String firstName = infoParts[0];
            String lastName = infoParts[1];
            double grade = Double.parseDouble(infoParts[2]);

            studentList.add(new Student(firstName, lastName, grade));

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}