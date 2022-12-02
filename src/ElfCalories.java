import java.io.File;
import java.io.FileNotFoundException;
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

        //make a list of all the "elves"
        ArrayList elves = new ArrayList();

        //create a pointer to the current line
        String next = scr.nextLine();
        int i = 0;

        //while there is still a next line
        while(scr.hasNext()) {
            //if the current line isn't blank
            if(!next.isEmpty()) {
                //if the current elf has a value
                if(elves.get(i).)
                    //create a variable for the line's value
                    String snackLine = elves.get(i).toString();
                    int snackValue = Integer.parseInt(snackLine);

                    //add the snack value to the elf's total value
                    elves.add(i,next);
            }
            //if the line is blank, make a new elf
            //move the pointer to the next line
        }

    }
}
