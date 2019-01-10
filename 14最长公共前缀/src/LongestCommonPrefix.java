/*
 * ��дһ�������������ַ��������е������ǰ׺��

��������ڹ���ǰ׺�����ؿ��ַ��� ""��

ʾ�� 1:

����: ["flower","flow","flight"]
���: "fl"
ʾ�� 2:

����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��
˵��:

��������ֻ����Сд��ĸ a-z ��
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));

	}
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1;i < strs.length;i++) {
        	while(strs[i].indexOf(prefix) != 0) {
        		prefix = prefix.substring(0, prefix.length()-1);
        		if(prefix.isEmpty())
        			return "";
        	}
        }
        return prefix;
    }
}
