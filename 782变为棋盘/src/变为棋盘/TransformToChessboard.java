package ��Ϊ����;
/*
 * һ�� N x N�� board ���� 0 �� 1 ��� ��ÿ���ƶ����������⽻�����л������е�λ�á�

�������������Ϊ �����̡� �������С�ƶ������������̡� ��ָ����һ������������ĸ������ֵ���뱾��ͬ�ľ�����������ڿ��еı任����� -1��

ʾ��:
����: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
���: 2
����:
һ�ֿ��еı任��ʽ���£������ң�

0110     1010     1010
0110 --> 1010 --> 0101
1001     0101     1010
1001     0101     0101

��һ���ƶ������˵�һ�к͵ڶ��С�
�ڶ����ƶ������˵ڶ��к͵����С�


����: board = [[0, 1], [1, 0]]
���: 0
����:
ע�����Ͻǵĸ�ֵΪ0ʱҲ�ǺϷ������̣��磺

01
10

Ҳ�ǺϷ�������.

����: board = [[1, 0], [1, 0]]
���: -1
����:
����ı任������ʹ��������Ϊ�Ϸ������̡�
 

��ʾ��

board �Ƿ������������ķ�Χ��[2, 30]��
board[i][j] ��ֻ���� 0�� 1��
 */
public class TransformToChessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
		System.out.println(movesToChessboard(board));
	}
	public static int movesToChessboard(int[][] board) {
		int n = board.length, rowSum = 0, colSum = 0, rowDiff = 0, colDiff = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if((board[0][0] ^ board[i][0] ^ board[0][j] ^ board[i][j]) != 0) {
                	return -1;
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            rowSum += board[0][i];
            colSum += board[i][0];
            if(board[i][0] == i % 2) {
            	rowDiff += 1;
            }else {
            	rowDiff += 0;
            }
            if(board[0][i] == i % 2) {
            	colDiff += 1;
            }else {
            	colDiff += 0;
            }
        }
        if (n / 2 > rowSum || rowSum > (n + 1) / 2) return -1;
        if (n / 2 > colSum || colSum > (n + 1) / 2) return -1;
        if (n % 2 == 1) {
            if (rowDiff % 2 == 1) rowDiff = n - rowDiff;
            if (colDiff % 2 == 1) colDiff = n - colDiff;
        } else {
            rowDiff = Math.min(n - rowDiff, rowDiff);
            colDiff = Math.min(n - colDiff, colDiff);
        }
        return (rowDiff + colDiff) / 2;
    }
}

/*
 * �ο���copy���ˣ�https://www.cnblogs.com/grandyang/p/9053705.html
 */
