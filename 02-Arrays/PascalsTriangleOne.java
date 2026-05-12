public class PascalsTriangleOne {

    public static int pascalTriangleI(int r, int c) {
        return nCr(c - 1, r -1);
    }

    public static int nCr(int n,  int r) {
        if (r > n - r) {
            r = n -r;
        }

        if (r == 1) return n;

        int res = 1; // to store the result 
        
        // Calculate nCr using iterative method avoiding overflow 
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return res; // return
    }

    public static void main(String[] args) {
        
    }    
}
