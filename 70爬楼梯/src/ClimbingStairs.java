/*
 * ����������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

ע�⣺���� n ��һ����������

ʾ�� 1��

���룺 2
����� 2
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 ��
2.  2 ��
ʾ�� 2��

���룺 3
����� 3
���ͣ� �����ַ�����������¥����
1.  1 �� + 1 �� + 1 ��
2.  1 �� + 2 ��
3.  2 �� + 1 ��
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n) {
		int[] f = new int[n + 1]; 
		int i; 
		f[0] = 1; 
		f[1] = 2; 
		for(i = 2; i < n; i++){ 
			f[i] = f[i - 1]+ f[i - 2]; 
		} 
		return f[n-1];
    }
}
