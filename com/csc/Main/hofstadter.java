package hofstadter.com.csc.Main;

public class hofstadter {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(hof(i));
        }
    }

    public static <A> int hof(int n) {
        if (n == 0)
            return 0;
        return n - hof(hof(n - 1));
    }
}
