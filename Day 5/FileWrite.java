package day5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        String filePath = "C:/fullstack-course/java-course/test/src/day5/sample";

        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write("Hello from FileWriter!\n");
            fw.write("Java file writing demo.\n");

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}