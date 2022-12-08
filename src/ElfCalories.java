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
        ArrayList elves = new ArrayList(3000);

        int i = 0;

        //while there is still a next line
        while (scr.hasNext()) {
            //if the current line isn't blank
            if (!Objects.equals(scr.nextLine(), "")) {
                if (elves.isEmpty()) {
                    //create a new elf
                    elves.add(0, 0);
                    System.out.println("The first elf has been created.");
                }
                    //if the current elf does not have a value yet
                    if (elves.get(i).equals(0)) {
                        //add the current number to the elf
                        elves.add(i, scr.nextLine());
                        System.out.println("Added first snack to elf. Value " + elves.get(i));
                    } else {
                        //create a variable for the elf's value
                        String snackValue = elves.get(i).toString();
                        int elfValue = Integer.parseInt(snackValue);
                        System.out.println("Found elf's value. Current value: " + elfValue);

                        //create a variable for the line's value
                        int lineValue = Integer.parseInt(scr.nextLine());
                        System.out.println("Found line's value. Current value: " + lineValue);

                        //add the values
                        int elfTotal = lineValue + elfValue;
                        System.out.println("The elf's new value is " + elfTotal);

                        //add the snack value to the elf's total value
                        elves.add(i, elfTotal);
                        System.out.println("Making sure the elf's value is changed: " + elves.get(i));
                    }
                //if the line is blank, increment i and move to the next line
            }else{
                i++;
                scr.nextLine();

                //also, create a new elf
                elves.add(i, 0);
                System.out.println("A new elf has been created. Their name is elf #" + i);
            }

        }

        System.out.println("The most calories carried are: ");
    }
}
