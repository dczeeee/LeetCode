/*
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����

ʾ��:

����: "Hello World"
���: 5
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
		if(s == "")
			return 0;
		if(s.charAt(s.length()-1) == ' ')
			return 0;
        for(int i = s.length()-1;i>=0;i--) {
        	if(s.charAt(i) == ' ') {
        		return s.length()-i-1;
        	}
        }
        return s.length();
    }
}
