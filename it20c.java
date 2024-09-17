package arrays;

public class Arrays {

    public static void main(String[] args) {

        char[][] kaiimichii = {
            {'*', '*', '*', '*'},
            {'*', '*', '*', '*'},
            {'*', '*', '*', '*'}
        };

        // Print the 2D array
        for (int i = 0; i < kaiimichii.length; i++) {
            for (int j = 0; j < kaiimichii[i].length; j++) {
                System.out.print(kaiimichii[i][j] + " ");
            }
            System.out.println();
        }
    }
}
