package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String info = sc.nextLine();
            String[] infoParts = info.split(" ");

            String heroName = infoParts[0];
            int HP = Integer.parseInt(infoParts[1]);
            int MP = Integer.parseInt(infoParts[2]);

            if (HP <= 100) {
                heroesHP.put(heroName, HP);
            }
            if (MP <= 200) {
                heroesMP.put(heroName, MP);
            }
        }
        String command = sc.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            switch (commandParts[0]) {
                case "CastSpell":
                    String hero = commandParts[1];
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spell = commandParts[3];

                    int currentMP = heroesMP.get(hero);
                    int mpLeft = currentMP - mpNeeded;

                    if (currentMP >= mpNeeded) {
                        heroesMP.put(hero, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spell, mpLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", hero, spell);
                    }
                    break;
                case "TakeDamage":
                    String heroName = commandParts[1];
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];

                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;

                    if (currentHP  > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %s HP left!%n", heroName, damage, attacker, currentHP);
                        heroesHP.put(heroName, currentHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    String heroName1 = commandParts[1];
                    int amount = Integer.parseInt(commandParts[2]);

                    int currentMP1 = heroesMP.get(heroName1);
                    currentMP1 += amount;

                    if (currentMP1 > 200) {
                        currentMP1 = 200;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName1, currentMP1 - heroesMP.get(heroName1));
                    heroesMP.put(heroName1, currentMP1);
                    break;
                case "Heal":
                    String heroName2 = commandParts[1];
                    int amount1 = Integer.parseInt(commandParts[2]);

                    int currentHP1 = heroesHP.get(heroName2);
                    currentHP1 += amount1;


                    if (currentHP1 > 100) {
                        currentHP1 = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName2, currentHP1 - heroesHP.get(heroName2));
                    heroesHP.put(heroName2, currentHP1);
                    break;
            }

            command = sc.nextLine();
        }
        heroesHP.forEach((heroName, value) -> {
            System.out.println(heroName);
            System.out.println(" HP: " + value);
            System.out.println(" MP: " + heroesMP.get(heroName));
        });
    }
}
