import packages.rainbow.*;

public class Runner {
    public static void main(String args[]) {
        System.out.println("\n\n");
        System.out.println("FORMATTING");
        System.out.println("bold : " + rainbow.bold("bold"));
        System.out.println("dim : " + rainbow.dim("dim"));
        System.out.println("italic : " + rainbow.italic("italic"));
        System.out.println("underline : " + rainbow.underline("underline"));
        System.out.println("blink : " + rainbow.blink("blink"));
        System.out.println("lighten : " + rainbow.lighten("lighten"));
        System.out.println("inverted : " + rainbow.inverted("inverted"));
        System.out.println("hidden : " + rainbow.hidden("hidden"));

        System.out.println();
        System.out.println("COLORS");
        System.out.println("black : " + rainbow.black("black"));
        System.out.println("red : " + rainbow.red("red"));
        System.out.println("green : " + rainbow.green("green"));
        System.out.println("yellow : " + rainbow.yellow("yellow"));
        System.out.println("blue : " + rainbow.blue("blue"));
        System.out.println("purple : " + rainbow.purple("purple"));
        System.out.println("cyan : " + rainbow.cyan("cyan"));
        System.out.println("white : " + rainbow.white("white"));
        System.out.println("rainbow : " + rainbow.rainbow("rainbow"));
    }
}
