public class hofstadter {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            int n = i;
            System.out.println(String.format("squenceG(%d) == %d ", n, hof(i)));
        }
    }

    public static <A> int hof(int n) {
        if (n == 0)
            return 0;
        return n - hof(hof(n - 1));
    }
}
