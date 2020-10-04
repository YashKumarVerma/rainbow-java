package packages.rainbow;

public class rainbow {
    public static String bold(String s) {
        return "\\e[3m" + s + "\\e[0m";
    }
}