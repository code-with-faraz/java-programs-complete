public class Pattern{
    public static void main(String[] args) {
        int[] rows = {6, 4, 3, 2, 1};

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows[i]; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}