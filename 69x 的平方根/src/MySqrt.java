/*
 * ʵ�� int sqrt(int x) ������

���㲢���� x ��ƽ���������� x �ǷǸ�������

���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��

ʾ�� 1:

����: 4
���: 2
ʾ�� 2:

����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842..., 
     ���ڷ���������������С�����ֽ�����ȥ��
 */
public class MySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		System.out.println(mySqrt(x));
	}
	public static int mySqrt(int x) {
        for(long i = 0; i<Integer.MAX_VALUE;i++) {
        	if(i*i<=x&&(i+1)*(i+1)>x) {
        		return (int) i;
        	}
        }
        return 0;
    }
}
/*
 * ����ʲô���ɲ�����
 * public int mySqrt(int x) {
        long t = x;
	t = 0x5f3759df - (t >> 1);
	while (!(t*t <= x && (t+1)*(t+1) > x))
		t = (x/t + t)/2;
	return (int)t;
    }
 */
