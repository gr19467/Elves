import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        String path = "res/rps.txt";
        String test = "res/testrps.txt";
        File file = new File(path);

        Scanner scr;

        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //if we make it this far, we found our file, all is well.
        System.out.println("File found.");

        //int for points
        int points = 0;

        while(scr.hasNext()) {
            String round = scr.nextLine();

            //booleans for win, lose, and draw (all false for now)
            boolean win = false;
            boolean lose = false;
            boolean draw = false;

            //get the first character (index 0)
            char op = round.charAt(0);
            System.out.println("Opponent played " + op);
            //get the second character (index 2)
            char outcome = round.charAt(2);
            System.out.println("You need to " + outcome);

            char me;

            if (outcome == 'X') {
                points += 0;

                if(op == 'A'){
                    me = 'Z';
                    System.out.println("You played " + me);
                }else if(op == 'B'){
                    me = 'X';
                    System.out.println("You played " + me);
                }else{
                    me = 'Y';
                    System.out.println("You played " + me);
                }

            } else if (outcome == 'Y') {
                points += 3;

                if(op == 'A'){
                    me = 'X';
                    System.out.println("You played " + me);
                }else if(op == 'B'){
                    me = 'Y';
                    System.out.println("You played " + me);
                }else{
                    me = 'Z';
                    System.out.println("You played " + me);
                }

            }else{
                points += 6;

                if(op == 'A'){
                    me = 'Y';
                    System.out.println("You played " + me);
                }else if(op == 'B'){
                    me = 'Z';
                    System.out.println("You played " + me);
                }else{
                    me = 'X';
                    System.out.println("You played " + me);
                }
            }

            if (me == 'X') {
                points += 1;
            } else if (me == 'Y') {
                points += 2;
            }else{
                points += 3;
            }

        }
        System.out.println("Your final score was " + points);
    }
}
