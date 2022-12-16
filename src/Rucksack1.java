import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rucksack1 {

    public static int alphabet(char let){
        if(let == 'a'){
            return 1;
        } else if (let == 'b') {
            return 2;
        } else if (let == 'c') {
            return 3;
        } else if (let == 'd') {
            return 4;
        }else if(let == 'e'){
            return 5;
        }else if(let == 'f'){
            return 6;
        } else if (let == 'g') {
            return 7;
        } else if (let == 'h') {
            return 8;
        } else if (let == 'i') {
            return 9;
        }else if(let == 'j'){
            return 10;
        }else if(let == 'k'){
            return 11;
        } else if (let == 'l') {
            return 12;
        } else if (let == 'm') {
            return 13;
        } else if (let == 'n') {
            return 14;
        }else if(let == 'o'){
            return 15;
        }else if(let == 'p'){
            return 16;
        } else if (let == 'q') {
            return 17;
        } else if (let == 'r') {
            return 18;
        } else if (let == 's') {
            return 19;
        }else if(let == 't'){
            return 20;
        }else if(let == 'u'){
            return 21;
        } else if (let == 'v') {
            return 22;
        } else if (let == 'w') {
            return 23;
        } else if (let == 'x') {
            return 24;
        }else if(let == 'y'){
            return 25;
        }else if(let == 'z'){
            return 26;
        } else if (let == 'A') {
            return 27;
        } else if (let == 'B') {
            return 28;
        } else if (let == 'C') {
            return 29;
        }else if(let == 'D'){
            return 30;
        }else if(let == 'E'){
            return 31;
        } else if (let == 'F') {
            return 32;
        } else if (let == 'G') {
            return 33;
        } else if (let == 'H') {
            return 34;
        }else if(let == 'I'){
            return 35;
        }else if(let == 'J'){
            return 36;
        } else if (let == 'K') {
            return 37;
        } else if (let == 'L') {
            return 38;
        } else if (let == 'M') {
            return 39;
        }else if(let == 'N'){
            return 40;
        }else if(let == 'O'){
            return 41;
        } else if (let == 'P') {
            return 42;
        } else if (let == 'Q') {
            return 43;
        } else if (let == 'R') {
            return 44;
        }else if(let == 'S'){
            return 45;
        }else if(let == 'T'){
            return 46;
        } else if (let == 'U') {
            return 47;
        } else if (let == 'V') {
            return 48;
        } else if (let == 'W') {
            return 49;
        }else if(let == 'X'){
            return 50;
        }else if(let == 'Y'){
            return 51;
        }else{
            return 52;
        }
    }

    public static void main(String[] args) {
        String path = "res/sack.txt";
        String test = "res/sacktest.txt";
        File file = new File(path);

        Scanner scr;

        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //if we make it this far, we found our file, all is well.
        System.out.println("File found.");

        //make an ArrayList for the first half letters
        ArrayList<Character> lets = new ArrayList<>();

        //make an ArrayList for the priority letters
        ArrayList<Character> pri = new ArrayList<>();

        //make an int for the total
        int total = 0;

        while(scr.hasNext()){
            String sack = scr.nextLine();

            //loop across the array to add each letter to the lists
            for (int i = 0; i < sack.length(); i++) {
                char let = sack.charAt(i);

                //if we're in the first half of the sack
                if(i < sack.length()/2) {
                    //add the current letter to the first list
                    lets.add(i,let);
                    System.out.println("Added " + let + " to the list.");
                }else{
                    //if the letter we're on is in the list already
                    System.out.println("Checking if " + let + " is the priority here...");
                    if(lets.contains(let)) {
                        //add it to the pri list
                        pri.add(pri.size(), let);
                        System.out.println("It was the priority.");
                        i = sack.length();
                    }else{
                        System.out.println("It was not the priority.");
                    }
                }
            }

            lets.clear();
            System.out.println("Cleared lets, moving to next line.");
        }
        //loop across the list
        for (int i = 0; i < pri.size(); i++) {
            char c = pri.get(i);
            //run alphabet on the index
            int result = alphabet(c);
            System.out.println(c + "'s value is " + result + ".");
            //add the result to the total
            total += result;
            System.out.println("The total is now " + total + ".");
        }
        System.out.println("Total of priorities is " + total);
    }
}
