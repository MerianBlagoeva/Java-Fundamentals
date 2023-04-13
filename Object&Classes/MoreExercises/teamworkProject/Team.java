package MoreExercises.teamworkProject;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Creator creator;
    private String name;
    private List<User> teamsUsers;
    private int membersSize;

    public Team(Creator creator, String name) {
        this.creator = creator;
        this.name = name;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getTeamsUsers() {
        return teamsUsers;
    }

    public void setTeamsUsers(List<User> teamsUsers) {
        this.teamsUsers = new ArrayList<>();
    }
//    public static String printUsers(List<User> userList) {
//        for (User user : userList) {
//            return user.getName();
//        }
//        return null;
//    }


    public int getMembersSize() {
        return membersSize;
    }

    public void setMembersSize(int membersSize) {
        this.membersSize = this.teamsUsers.size();
    }
}
