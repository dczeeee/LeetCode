
public class Search2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0)
            return false;
        int n = matrix[0].length;
        if(n == 0)
            return false;
        int i = m-1;
        int j = 0;
        while(i>=0 && j<n){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] < target)
                j += 1;
            else
                i -= 1;
        }
        return false;
    }
}
