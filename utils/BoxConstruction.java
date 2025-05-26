package utils;

public class BoxConstruction {
    public void construct(String say) {
        String strippedSay = stripANSICodes(say);
        int boxlength = strippedSay.length();

        if (boxlength <= 2) {
            System.out.println(" " + "_".repeat(boxlength));
            System.out.println("/" + " ".repeat(boxlength) + "\\");
            System.out.println("|" + say + "|");
            System.out.println(" " + "\\/");
        } else {
            System.out.println(" " + "_".repeat(boxlength));
            System.out.println("/" + " ".repeat(boxlength) + "\\");
            System.out.println("|" + say + "|");
            System.out.println("\\" + "_".repeat(boxlength - 3) + "  /");
            System.out.println(" ".repeat(boxlength - 2) + "\\/");
        }
    }

    public static String stripANSICodes(String input) {
        return input.replaceAll("\u001B\\[[;\\d]*m", "");
    }
}
