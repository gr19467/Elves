import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class ElfCalories {

    public static void main(String[] args) {
        String path = "res/calories.txt";
        String test = "res/testCalories.txt";
        File file = new File(test);

        Scanner scr;

        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //if we make it this far, we found our file, all is well.
        System.out.println("File found.");

        //make a list of all the "elves"
        ArrayList elves = new ArrayList();

    }
}