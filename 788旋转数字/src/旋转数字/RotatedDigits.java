package ��ת����;
/*
 * ���ǳ�һ���� X Ϊ����, �������ÿλ��������ر���ת 180 �Ⱥ������Կ��Եõ�һ����Ч�ģ��Һ� X ��ͬ������
 * Ҫ��ÿλ���ֶ�Ҫ����ת��
���һ������ÿλ���ֱ���ת�Ժ���Ȼ����һ�����֣� �����������Ч�ġ�
0, 1, �� 8 ����ת����Ȼ�������Լ���2 �� 5 ���Ի�����ת�ɶԷ���6 �� 9 ͬ��
������Щ����������������ת�Ժ󶼲�������Ч�����֡�

����������һ�������� N, ����� 1 �� N ���ж��ٸ��� X �Ǻ�����

ʾ��:
����: 10
���: 4
����: 
��[1, 10]�����ĸ������� 2, 5, 6, 9��
ע�� 1 �� 10 ���Ǻ���, ��Ϊ��������ת֮�󲻱䡣
ע��:

N ��ȡֵ��Χ�� [1, 10000]��
 */
public class RotatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		System.out.println(rotatedDigits(N));
	}
	public static int rotatedDigits(int N) {
        int cnt = 0;
        for(int i=1;i<=N;i++){
            String str = String.valueOf(i);
            if((str.contains("2")||str.contains("5")||str.contains("6")||str.contains("9"))&&(!str.contains("3")&&!str.contains("4")&&!str.contains("7")))
               cnt++;
        }
		return cnt;
    }
}
