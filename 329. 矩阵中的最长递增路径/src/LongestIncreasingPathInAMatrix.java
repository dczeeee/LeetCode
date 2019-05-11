/*
 * 给定一个整数矩阵，找出最长递增路径的长度。

对于每个单元格，你可以往上，下，左，右四个方向移动。 你不能在对角线方向上移动或移动到边界外（即不允许环绕）。

示例 1:

输入: nums = 
[
  [9,9,4],
  [6,6,8],
  [2,1,1]
] 
输出: 4 
解释: 最长递增路径为 [1, 2, 6, 9]。
示例 2:

输入: nums = 
[
  [3,4,5],
  [3,2,6],
  [2,2,1]
] 
输出: 4 
解释: 最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
 */
public class LongestIncreasingPathInAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int [][]dir={{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    private int [][]dp;
    public int dfs(int [][]matrix,int [][]dp,int i,int j){
    	if(dp[i][j]>0)  //已经计算过的直接返回即可
    		return dp[i][j];
    	int n=matrix.length,m=matrix[0].length;
    	int max=1;
    	for(int k=0;k<4;k++){
    		int x=dir[k][0]+i;
    		int y=dir[k][1]+j;
    		if(x<0||y<0||x>=n||y>=m||matrix[x][y]<=matrix[i][j])
            	continue;
    		int len=1+dfs(matrix,dp,x,y);
    		max=Math.max(len,max);
    	}
        dp[i][j]=max;
        return max;            
	}
	public int longestIncreasingPath(int[][] matrix) {
		if(matrix==null||matrix.length==0){
            return 0;
        }
        int n=matrix.length,m=matrix[0].length;
        dp=new int[n][m];
        int max=0;
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            	max=Math.max(dfs(matrix,dp,i,j),max);     
            }
        }
        return max;
    }
}
