package utils;

import java.util.Scanner;

public class BTFormQuestion {
    public boolean formExec(Scanner kbd) {
        while (true) {
            System.out.print("Do you want to enable BTForm mode? (y/n) ");
            String btconfirm = kbd.next();

            if (btconfirm.equalsIgnoreCase("y")) {
                return true; // Execute BTFormImplementation
            } else if (btconfirm.equalsIgnoreCase("n")) {
                return false; // Do not execute BTFormImplementation, go back to baseline program
            } else {
                System.out.println("Invalid input. Please enter a valid response.");
            }
        }
    }
}