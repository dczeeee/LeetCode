/*
 * ����һ�������� n������һ������ 1 �� n2 ����Ԫ�أ���Ԫ�ذ�˳ʱ��˳���������е������ξ���

ʾ��:

����: 3
���:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateMatrix(n));
	}
	public static int[][] generateMatrix(int n) {
		int[][] result=new int[n][n];
	    int x=0,y=0,count=1,flag=0;
	    while (n>0){
	        while (flag<n){result[x][y]=count; y++; count++; flag++;}
	        n--; y--; x++; flag=0;
	        while (flag<n){result[x][y]=count; x++; count++; flag++;}
	        x--; y--; flag=0;
	        while (flag<n){result[x][y]=count; y--; count++; flag++;}
	        n--; y++; x--; flag=0;
	        while (flag<n){result[x][y]=count; x--; count++; flag++;}
	        y++; x++; flag=0;
	    }
	    return result;
    }
}
