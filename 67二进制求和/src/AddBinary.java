/*
 * ���������������ַ������������ǵĺͣ��ö����Ʊ�ʾ����

����Ϊ�ǿ��ַ�����ֻ�������� 1 �� 0��

ʾ�� 1:

����: a = "11", b = "1"
���: "100"
ʾ�� 2:

����: a = "1010", b = "1011"
���: "10101"
 */
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}
	public static String addBinary(String a, String b) {
        int la = a.length();
        int lb = b.length();
        int len = Math.max(la, lb);
        return "��������";
    }
}
