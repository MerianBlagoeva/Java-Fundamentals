package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Define a class Student, which holds the following information about students: first name, last name, age, and hometown.
        Read the list of students until you receive the "end" command.
        After that, you will receive a city name. Print only students which are from the given city,
        in the following format: "{firstName} {lastName} is {age} years old".

         */

        List<Student> students = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("end")) {
            // TODO: read students and add them

            String[] studentParameters = input.split("\\s+");
            String firstName = studentParameters[0];
            String lastName = studentParameters[1];
            int age = Integer.parseInt(studentParameters[2]);
            String city = studentParameters[3];

            //TODO: overwrite if student already exists

            Student existing = findStudent(students, firstName, lastName);
            if (existing == null) {
                students.add(new Student(firstName, lastName, age, city));
            } else {
                existing.setAge(age);
                existing.setCity(city);
            }

            input = sc.nextLine();
        }

        String city = sc.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }
    }

    private static Student findStudent(List<Student> students, String firstName, String lastName) {
        for (Student s : students) {
            if (s.getFirstName().equals(firstName)
                    && s.getLastName().equals(lastName)) {
                return s;
            }
        }
        return null;
    }

//    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
//        for (int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            if (s.getFirstName().equals(firstName)
//                    && s.getLastName().equals(lastName)) {
//                return i;
//            }
//        }
//        return -1;
//    }

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        boolean isFrom(String city) {
            return this.city.equals(city);
        }

        String getInfo() {
            return String.format("%s %s is %s years old", this.firstName, this.lastName, this.age);
        }

        public String getFirstName() {
            return firstName;
        }


        public String getLastName() {
            return lastName;
        }


        public void setAge(int age) {
            this.age = age;
        }


        public void setCity(String city) {
            this.city = city;
        }
    }
}
