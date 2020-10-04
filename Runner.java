import packages.rainbow.*;

public class Runner {
    public static void main(String args[]) {
        System.out.println("\n\n");
        System.out.println("bold : " + rainbow.bold("bold"));
        System.out.println("dim : " + rainbow.dim("dim"));
        System.out.println("italic : " + rainbow.italic("italic"));
        System.out.println("underline : " + rainbow.underline("underline"));
        System.out.println("blink : " + rainbow.blink("blink"));
        System.out.println("lighten : " + rainbow.lighten("lighten"));
        System.out.println("inverted : " + rainbow.inverted("inverted"));
        System.out.println("hidden : " + rainbow.hidden("hidden"));
    }
}
