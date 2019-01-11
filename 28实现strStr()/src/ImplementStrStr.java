/*
 * ʵ�� strStr() ������

����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��

ʾ�� 1:

����: haystack = "hello", needle = "ll"
���: 2
ʾ�� 2:

����: haystack = "aaaaa", needle = "bba"
���: -1
˵��:

�� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣

���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
 */
public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello";
		String needle = "ll";
		System.out.println(strStr(haystack, needle));
	}
	public static int strStr(String haystack, String needle) {
		int h_len = haystack.length();
		int n_len = needle.length();
        for(int i = 0;i<=h_len-n_len;i++) {
        	if(haystack.substring(i,i+n_len).equals(needle)) {
        		return i;
        	}
        }
		return -1;
    }
}
