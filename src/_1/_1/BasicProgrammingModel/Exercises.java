package _1._1.BasicProgrammingModel;

/**
 * Created by irving.lopez on 06/09/16.
 */
public class Exercises {

    public static void main(String[] args) {
        int value = 10;
        _9(value);
        _9_me(value);
        _9_sol(value);
    }

    private static void _9(int n) {
        System.out.println(Integer.toBinaryString(n));
    }

    private static void _9_me(int n) {
        StringBuilder builder = new StringBuilder();
        do {
            builder.append(n % 2);
            n /= 2;
        } while (n > 0);
        System.out.println(builder.reverse().toString());
    }

    private static void _9_sol(int n) {
        String s = "";
        for (int c = n; c > 0; c /= 2) {
            s = (c % 2) + s;
        }
        System.out.println(s);
    }
}
