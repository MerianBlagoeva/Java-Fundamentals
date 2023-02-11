package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    /*
    Define a class Song, which holds the following information about songs: Type List, Name, and Time.
    On the first line, you will receive the number of songs - N.
    On the next N-lines, you will be receiving data in the following format: "{typeList}_{name}_{time}".
    On the last line, you will receive "Type List" / "all". Print only the names of the songs which are from that Type List / All songs.

     */
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] inputSongs = input.split("_");

            Song song = new Song(inputSongs[0], inputSongs[1], inputSongs[2]);

            listSongs.add(song);


        }
        String command = sc.nextLine();
        if (command.equals("all")) {
            for (Song song : listSongs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : listSongs) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }

//
//    public static void printSong(List<Song> list, String command) {
//        int whichOne = (command.equals("all") ? 1 : 0);
//
//    }
}

