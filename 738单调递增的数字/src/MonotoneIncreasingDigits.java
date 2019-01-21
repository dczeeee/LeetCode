/*
 * ����һ���Ǹ����� N���ҳ�С�ڻ���� N ������������ͬʱ���������Ҫ���������λ���ϵ������ǵ���������

�����ҽ���ÿ������λ���ϵ����� x �� y ���� x <= y ʱ�����ǳ���������ǵ��������ġ���

ʾ�� 1:

����: N = 10
���: 9
ʾ�� 2:

����: N = 1234
���: 1234
ʾ�� 3:

����: N = 332
���: 299
˵��: N ���� [0, 10^9] ��Χ�ڵ�һ��������

����ʵ������������������⣿
 */
public class MonotoneIncreasingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 332;
		System.out.println(monotoneIncreasingDigits(N));
	}
	public static int monotoneIncreasingDigits(int N) {
        for(int i = N;i >= 0;--i) {
        	StringBuffer sb = new StringBuffer(String.valueOf(i));
        	if(sb.length() == 1)
        		return i;
        	int flag = 1;
        	for(int j = sb.length()-1;j > 0;--j) {
        		if(sb.charAt(j) >= sb.charAt(j-1)) {
        			flag ++;
        		}
        		if(flag == sb.length()) {
        			return i;
        		}
        	}
        }
        return 0;
    }
}
