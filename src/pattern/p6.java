package pattern;

public class p6 {
    public static void main(String[] args) {
        int numRows = 4;
        int numCols = 5;
        int currentValue = 1;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(currentValue + "\t");
                currentValue++;
            }
            System.out.println();
        }
    }
}
