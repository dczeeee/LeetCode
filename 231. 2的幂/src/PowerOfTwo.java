/*
 * ����һ����������дһ���������ж����Ƿ��� 2 ���ݴη���

ʾ�� 1:

����: 1
���: true
����: 2^0 = 1
ʾ�� 2:

����: 16
���: true
����: 2^4 = 16
ʾ�� 3:

����: 218
���: false
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(isPowerOfTwo(n));
	}
	public static boolean isPowerOfTwo(int n) {
        if(n <= 0)	return false;
        return (n&(n-1)) == 0;
    }
}
