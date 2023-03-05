package Exercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Write a program which keeps the information about courses. Each course has a name and registered students.
        You will receive the course name and student name until you receive the command "end".
        Check if such a course already exists and if not - add the course.
        Register the user into the course. When you do receive the command "end",
        print the courses with their names and total registered users. For each contest, print the registered users.
         */

        String command = sc.nextLine();
        Map<String, List<String>> coursesStudents = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String course = command.split(" : ")[0];
            String student = command.split(" : ")[1];

            if (!coursesStudents.containsKey(course)) {
                coursesStudents.put(course, new ArrayList<>());
            }
            coursesStudents.get(course).add(student);

            command = sc.nextLine();
        }
        coursesStudents.forEach((key, value) -> {
            System.out.printf("%s: %d%n", key, value.size());
            value.forEach(student -> System.out.println("-- " + student));
        });
    }
}
