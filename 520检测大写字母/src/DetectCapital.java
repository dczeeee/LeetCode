/*
 * ����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��

���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�

ȫ����ĸ���Ǵ�д������"USA"��
������������ĸ�����Ǵ�д������"leetcode"��
������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
�������Ƕ����������û����ȷʹ�ô�д��ĸ��

ʾ�� 1:

����: "USA"
���: True
ʾ�� 2:

����: "FlaG"
���: False
ע��: �������ɴ�д��Сд������ĸ��ɵķǿյ��ʡ�
 */
public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "FlaG";
		System.out.println(detectCapitalUse(word));
	}
	public static boolean detectCapitalUse(String word) {
		return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.substring(1, word.length()).equals(word.substring(1, word.length()).toLowerCase());
    }
}
