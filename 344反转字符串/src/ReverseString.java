/*
 * ��дһ���������������ǽ�������ַ�����ת������

ʾ�� 1:

����: "hello"
���: "olleh"
ʾ�� 2:

����: "A man, a plan, a canal: Panama"
���: "amanaP :lanac a ,nalp a ,nam A"
 */
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
        StringBuffer res = new StringBuffer();
        for(int i = s.length()-1;i >= 0;i--) {
        	res.append(s.charAt(i));
        }
        return res.toString();
    }
}
