package utils;

import java.util.Scanner;
import BTForm.BTFormInterpreter; 

public class BTFormImplementation {
    public boolean startImplementation(Scanner kbd) {
        System.out.print("What do you want me to say?: ");
        String say = kbd.nextLine();

        if (say.equals("!exit")) {
            Exit exec = new Exit();
            boolean shouldExit = exec.leave(kbd);
            if (shouldExit) {
                return false; 
            }
        } else if (say.equals("!exitprog")) {
            Exit exec = new Exit();
            boolean shouldExit = exec.leave(kbd);
            if (shouldExit) {
                System.exit(0);
            }
        } else {
            String sayANSI = BTFormInterpreter.parse(say);
            BoxConstruction msgBox = new BoxConstruction();
            msgBox.construct(sayANSI);
        }
        return true;  
    }
}