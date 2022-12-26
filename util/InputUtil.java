package projects.studentRegistration.util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print(title );
        String text = sc.next();
        return text;
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print(title );
        int text = sc.nextInt();
        return text;
    }

    public static char requireSymbol(String title) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        System.out.print(title);
        char text = sc.next().charAt(0);
        return text;
    }
}
