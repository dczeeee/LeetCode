/*
 * ����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��

ʾ�� 1:

����: "Let's take LeetCode contest"
���: "s'teL ekat edoCteeL tsetnoc" 
ע�⣺���ַ����У�ÿ�������ɵ����ո�ָ��������ַ����в������κζ���Ŀո�
 */
public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
        StringBuffer res = new StringBuffer();
		String[] words = s.split(" ");
		for(int i = 0;i < words.length;i++) {
			res.append(new StringBuffer(words[i]).reverse()+" ");
		}
		return res.substring(0, res.length()-1);
    }
}
