import java.util.ArrayList;
import java.util.List;

public class PascalTriangleThree {
        public List<Integer> pascalTriangleII(int r) {

        List<Integer> solution = new ArrayList<>();
        int result = 1;

        for (int column = 0; column < r; column++) {
            if (column == 0) {
                solution.add(1);
                continue;
            }

            result = result * (r - column);
            result /= column;

            solution.add(result);
        }

        return solution;
    }

    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>();

        for (int i = 1; i <= n; i++) {
            solution.add(pascalTriangleII(i));
        }

        return solution;
    }
}
