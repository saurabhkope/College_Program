//CREATE PACKAGE
package series;

public class SquareSeries {
    public void generateSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
        System.out.println();
    }
}
