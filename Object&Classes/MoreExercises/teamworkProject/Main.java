package MoreExercises.teamworkProject;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Team> teams = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] tokens = input.split("-");
            Creator creator = new Creator(tokens[0]);
            Team team = new Team(creator, tokens[1]);

            List<User> users = new ArrayList<>();
            List<Creator> creatorList = new ArrayList<>();
            creatorList.add(creator);

            team.setTeamsUsers(users);
            teams.add(team);


            for (Team t : teams) {
                if (t.getName().equals(team.getName()) && (!t.getCreator().getName().equals(creator.getName()))) {
                    System.out.printf("Team %s was already created!%n", team.getName());
                    teams.remove(team);
                    break;

                }
            }
            int count2 = 0;
            for (Creator c : creatorList) {
                if (c.equals(creator)) {
                    count2++;
                    if (count2 == 2) {
                        System.out.printf("%s cannot create another team!", creator.getName());
                        System.out.println();
                        teams.remove(team);
                        creatorList.remove(creator);
                    }
                }
            }
            if (teams.contains(team)) {
                System.out.printf("Team %s has been created by %s!", team.getName(), creator.getName());
                System.out.println();
            }

        }
        String command = sc.nextLine();
        while (!command.equals("end of assignment")) {
            String[] tokens = command.split("->");
            User user = new User(tokens[0]);


            boolean thereIsSuchTeam = false;

            for (Team t : teams) {
                if (t.getName().equals(tokens[1])) {
                    thereIsSuchTeam = true;
                    if (!t.getTeamsUsers().contains(user) && !t.getCreator().getName().contains(user.getName())) {
                        t.getTeamsUsers().add(user);
                        user.setTeam(t);
                    } else {
                        System.out.printf("Member %s cannot join team %s!", user.getName(), t.getName());
                        System.out.println();
                    }
                }
            }
            if (!thereIsSuchTeam) {
                System.out.printf("Team %s does not exist!", tokens[1]);
                System.out.println();
            }

            command = sc.nextLine();
        }
        List<Team> sortedTeams = teams.stream().sorted(Comparator.comparing(Team::getMembersSize).reversed()).collect(Collectors.toList());




        for (Team t : sortedTeams) {
            if (t.getTeamsUsers().size() > 0) {
                System.out.printf("%s%n- %s%n", t.getName(), t.getCreator().getName());
            }

//            for (Team team : sortedTeams) {
//                for (int i = 0; i < sortedTeams.size() - 1; i++) {
//                    System.out.println("-- " + team.getTeamsUsers().get(i).getName());
//                }
//            }

            int count = 0;
            for (User user : t.getTeamsUsers()) {
                System.out.println("-- " + user.getName());
                count++;
            }
        }
        System.out.println("Teams to disband:");
        for (Team t :sortedTeams) {
            if (t.getTeamsUsers().size() == 0) {
                System.out.printf("%s", t.getName());
            }
        }
    }
}
