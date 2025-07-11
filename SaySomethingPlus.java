// Program: SaySomething+
// Description: An improvement upon SaySomething, a cowsay-inspired program.

import java.util.Scanner; // Imports Scanner utility.
import utils.*;

public class SaySomethingPlus {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println(Formatting.ITALIC + "Say" + Formatting.RESET + Formatting.BOLD_ITALIC + "Something" + Formatting.YELLOW + "+" + Formatting.RESET + "v1.1"); 
        System.out.println("(0) 2025 CommonPolarity. No rights reserved.");
        System.out.println("Need help doing something? Go & type !help.");
        System.out.println("This program is licensed under the MIT License.");

        while(true) {
            System.out.print("What do you want me to say?: ");
            String say = kbd.nextLine();

            switch(say) {
                case "!exit":
                    Exit exec = new Exit();
                    boolean shouldExit = exec.leave(kbd);
                    if (shouldExit) {
                        break;
                    }
                    continue;
                case "!btform":
                    BTFormQuestion ask = new BTFormQuestion();
                    boolean execMode = ask.formExec(kbd);
                    System.out.println("BTForm mode enabled. To exit the program, you must type !exitprog.");
                    System.out.println("To only exit BTForm mode, just type !exit.");
                    while (execMode) {
                        BTFormImplementation addMore = new BTFormImplementation();
                        execMode = addMore.startImplementation(kbd);
                    }
                    return;
                case "!help":
                    Help display = new Help();
                    display.help(say);
                    return;
                default:
                    BoxConstruction msgBox = new BoxConstruction();
                    msgBox.construct(say);
                    return;
            }
            kbd.close();
        }
    }
}