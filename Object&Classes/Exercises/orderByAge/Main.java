package Exercises.orderByAge;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        You will receive an unknown number of lines. On each line, you will receive an array with 3 elements.
        The first element will be a string and represents the name of the person.
        The second element will be a string and will represent the ID of the person.
        The last element will be an integer which represents the age of the person.
         */

        String input = sc.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] personInfo = input.split("\\s+");
            String name = personInfo[0];
            String id = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);

            personList.add(new Person(name, id, age));
            input = sc.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.println(person);
        }

    }
}
