public class assign1 {

    public static void main(String[] args) {
        int rows = 5;

        for(int m = 1; m <= rows; ++m) {
            for(int n = 1; n <= m; ++n) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
