public class Ex05_Un01 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 9, 6},
            {7, 8, 5}
        };
        int x = 0;
        int y = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > matriz[x][y]) {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Maior elemento: " + matriz[x][y] + " na posição (" + x + ", " + y + ")");
    }
}
