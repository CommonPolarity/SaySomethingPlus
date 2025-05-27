package utils;

import BTForm.BTFormInterpreter; 

public class Help {
    public void help(String say) {
        System.out.println(BTFormInterpreter.parse("<b>Say</b><bi>Something[warn]+[/warn]</bi> Help"));
        System.out.println(BTFormInterpreter.parse("<i>!btform</i>: Enables BTForm mode."));
        System.out.println(BTFormInterpreter.parse("<i>!exit</i>: Outside of BTForm mode, exits out of program."));
        System.out.println("In BTForm mode, exits out of BTForm mode.");
        System.out.println(BTFormInterpreter.parse("<i>!exitprog</i>: Exits out of program. <b>BTForm mode exclusive.</b>"));
        System.out.println(BTFormInterpreter.parse("<i>!help</i>: Shows commands and purpose."));
    }
}