package Exercises;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Write a program which keeps the information about companies and their employees.
        You will receive company names and an employees' id until you receive the "End" command. Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
        Print the company name and each employee's id in the following format:
        "{company_name}
        -- {id1}
        -- {id2}
        …
        -- {idN}"
         */

        String command = sc.nextLine();

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        while (!command.equals("End")) {
            String company = command.split(" ->")[0];
            String id = command.split(" ->")[1];

            companyEmployees.putIfAbsent(company, new ArrayList<>());

            if (!companyEmployees.get(company).contains(id)) {
                companyEmployees.get(company).add(id);
            }

            command = sc.nextLine();
        }
        companyEmployees.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(e -> System.out.println("--" + e));
        });

    }
}
