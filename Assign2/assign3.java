public class assign3 {

    public static void main(String[] args) {
        int rows = 7;

        for(int m = rows; m >= 1; --m) {
            for(int n = 1; n <= m; ++n) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}