package utils;

import java.util.Scanner;

public class Exit {
    public boolean leave(Scanner kbd) {
        while(true) {
            System.out.print("Are you sure you want to exit? (y/n) ");
            String exitconfirm = kbd.next();

            if (exitconfirm.equalsIgnoreCase("y")) {
                return true;  // Exit program immediately
            } else if (exitconfirm.equalsIgnoreCase("n")) {
                kbd.nextLine();
                return false;    // Don't exit, continue program
            } else {
                System.out.println("Invalid input. Please enter a valid response.");
            }
        }
    }
}