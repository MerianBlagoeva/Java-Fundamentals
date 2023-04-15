import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, Integer> userLikes = new LinkedHashMap<>();
        Map<String, Integer> userComments = new LinkedHashMap<>();

        while (!command.equals("Log out")) {
            String[] commandParts = command.split(": ");
            switch (commandParts[0]) {
                case "New follower":
                    String username = commandParts[1];
                    if (!userLikes.containsKey(username) && !userComments.containsKey(username)) {
                        userLikes.put(username, 0);
                        userComments.put(username, 0);
                    }
                    break;
                case "Like":
                    String name = commandParts[1];
                    int count = Integer.parseInt(commandParts[2]);
                    if (!userLikes.containsKey(name)) {
                        userLikes.put(name, count);
                        userComments.put(name, 0);
                    } else {
                        userLikes.put(name, userLikes.get(name) + count);
                    }

                    break;
                case "Comment":
                    String user = commandParts[1];
                    if (!userComments.containsKey(user)) {
                        userComments.put(user, 1);
                        userLikes.put(user, 0);
                    } else {
                        userComments.put(user, userComments.get(user) + 1);
                    }
                    break;
                case "Blocked":
                    String nameUser = commandParts[1];
                    if (userLikes.containsKey(nameUser) && userComments.containsKey(nameUser)) {
                        userLikes.remove(nameUser);
                        userComments.remove(nameUser);
                    } else {
                        System.out.printf("%s doesn't exist.%n", nameUser);
                    }
                    break;
            }

            command = sc.nextLine();
        }
        System.out.printf("%d followers%n", userLikes.size());
        if (userComments.size() > 0) {
            userLikes.forEach((key, value) -> System.out.printf("%s: %d%n", key, (value + userComments.get(key))));
        }
    }
}
