/*
 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��

ʾ�� 1��

����: "babad"
���: "bab"
ע��: "aba" Ҳ��һ����Ч�𰸡�
ʾ�� 2��

����: "cbbd"
���: "bb"
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
        	return "";
        char[] chars = s.toCharArray();
        int num = chars.length-1;
        int maxLength = 0, left = 0, right = 0;
        for (int i = 0; i < chars.length - maxLength; ) {
			char ch = chars[i];
			int pos = s.lastIndexOf(ch, num); //��λ��ͬ�ַ�
			if (i == pos || pos - i < maxLength) {
				i++;
				num = chars.length - 1;
				continue;
			}
			int posRec = pos;
			pos--;
			boolean success = true;
			for (int j = i + 1; j < pos; j++, pos--) { //�ж��Ƿ�����ַ���
				if (chars[j] != chars[pos]) {
					success = false;
					break;
				}
			}
			if (success) {  //��¼λ��
				maxLength = posRec - i;
				left = i;
				right = posRec;
			}
			num = posRec - 1;
		}
		return s.substring(left, right + 1);
    }
}
