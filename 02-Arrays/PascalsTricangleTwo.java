public class PascalsTricangleTwo {
    public int[] pascalTriangleII(int r) {

        int [] solution = new int[r];
        int result = 1;

        for (int column = 0; column < r; column++) {
            if (column == 0) {
                solution[column] = 1;
                continue;
            }

            result = result * (r - column);
            result /= column;

            solution[column] = result;
        }

        return solution;
    }
}