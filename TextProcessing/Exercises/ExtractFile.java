package Exercises;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
//        String[] pathParts = path.split("\\\\");
//        String fileNameAndExtension = pathParts[pathParts.length - 1];
//        String fileName = fileNameAndExtension.split("\\.")[0];
//        String extension = fileNameAndExtension.split("\\.")[1];
//
//        System.out.println("File name: " + fileName);
//        System.out.println("File extension: " + extension);

        int lastIndex = path.lastIndexOf("\\");
        String nameAndExtension = path.substring(lastIndex + 1);
        int pointIndex = nameAndExtension.indexOf(".");
        String fileName = nameAndExtension.substring(0, pointIndex);
        String fileExtension = nameAndExtension.substring(pointIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
