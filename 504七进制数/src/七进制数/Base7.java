package �߽�����;

/*
 * ����һ������������ת��Ϊ7���ƣ������ַ�����ʽ�����

ʾ�� 1:

����: 100
���: "202"
ʾ�� 2:

����: -7
���: "-10"
ע��: ���뷶Χ�� [-1e7, 1e7] ��
 */

public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToBase7(100));
		System.out.println(convertToBase7(-49));
		System.out.println(convertToBase7(-8));
	}
	public static String convertToBase7(int num) {
		String str=new String();
		StringBuffer sb = new StringBuffer(str);
		int i = 0;
		while(Math.abs(num)>=7) {
			i = num%7;
			num /= 7;
			sb.insert(0,Math.abs(i));
		}
		if(num<7) {
			sb.insert(0,num);
		}
        return sb.toString();
    }
}
