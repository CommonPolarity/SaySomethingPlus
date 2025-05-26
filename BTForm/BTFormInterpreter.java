// Program: BTForm
// Description: A basic markup language inspired by HTML made for SaySomething+.
package BTForm;
import java.util.*;

public class BTFormInterpreter {
    private static final Map<String, String> ansiStyles = new HashMap<>();
    private static final String RESET = "\033[0m"; // Declare this outside the static block

    static {
///////////////////////////////////////////////////////////////////////////////////////////////
//// FORMATTING ALIASES FOR ANSI
//////////////////////////////////////////////////////////////////////////////////////////////
        /// Text formatting
        ansiStyles.put("<i>", "\033[3m");
        ansiStyles.put("<b>", "\033[1m");
        ansiStyles.put("<bi>", "\033[1;3m");
        
        /// Colors
        // Red
        ansiStyles.put("[red]", "\033[31m");
        ansiStyles.put("[r]", "\033[31m");
        ansiStyles.put("[error]", "\033[31m");
        ansiStyles.put("[err]", "\033[31m");
        // Yellow
        ansiStyles.put("[yellow]", "\033[33m");
        ansiStyles.put("[y]", "\033[33m");
        ansiStyles.put("[warning]", "\033[33m");
        ansiStyles.put("[warn]", "\033[33m");
        // Green
        ansiStyles.put("[green]", "\033[32m");
        ansiStyles.put("[g]", "\033[32m");
        ansiStyles.put("[success]", "\033[32m");
        ansiStyles.put("[succ]", "\033[32m"); // haha funny 2017 humor
        // Blue
        ansiStyles.put("[blue]", "\033[34m");
        ansiStyles.put("[b]", "\033[34m");
        ansiStyles.put("[info]", "\033[34m");
        ansiStyles.put("[i]", "\033[34m");
        // Cyan
        ansiStyles.put("[cyan]", "\033[36m");
        ansiStyles.put("[c]", "\033[36m");
        // Magenta
        ansiStyles.put("[magenta]", "\033[35m");
        ansiStyles.put("[m]", "\033[35m");
        // White
        ansiStyles.put("[white]", "\033[37m");
        ansiStyles.put("[w]", "\033[37m");

///////////////////////////////////////////////////////////////////////////////////////////////
//// RESET ALIASES FOR ANSI
//////////////////////////////////////////////////////////////////////////////////////////////
        /// Text formatting
        ansiStyles.put("</i>", RESET);
        ansiStyles.put("</b>", RESET);
        ansiStyles.put("</bi>", RESET);
        
        /// Colors
        ansiStyles.put("[/red]", RESET);
        ansiStyles.put("[/r]", RESET);
        ansiStyles.put("[/error]", RESET);
        ansiStyles.put("[/err]", RESET);

        ansiStyles.put("[/yellow]", RESET);
        ansiStyles.put("[/y]", RESET);
        ansiStyles.put("[/warning]", RESET);
        ansiStyles.put("[/warn]", RESET);

        ansiStyles.put("[/green]", RESET);
        ansiStyles.put("[/g]", RESET);
        ansiStyles.put("[/success]", RESET);
        ansiStyles.put("[/succ]", RESET);

        ansiStyles.put("[/blue]", RESET);
        ansiStyles.put("[/b]", RESET);
        ansiStyles.put("[/info]", RESET);
        ansiStyles.put("[/i]", RESET);

        ansiStyles.put("[/cyan]", RESET);
        ansiStyles.put("[/c]", RESET);

        ansiStyles.put("[/magenta]", RESET);
        ansiStyles.put("[/m]", RESET);

        ansiStyles.put("[/white]", RESET);
        ansiStyles.put("[/w]", RESET);
    }

    public static String parse(String input) {
        for (Map.Entry<String, String> entry : ansiStyles.entrySet()) {
            input = input.replace(entry.getKey(), entry.getValue());
        }
        return input;
    }
}
