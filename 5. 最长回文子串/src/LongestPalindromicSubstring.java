/*
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
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
			int pos = s.lastIndexOf(ch, num); //定位相同字符
			if (i == pos || pos - i < maxLength) {
				i++;
				num = chars.length - 1;
				continue;
			}
			int posRec = pos;
			pos--;
			boolean success = true;
			for (int j = i + 1; j < pos; j++, pos--) { //判断是否回文字符串
				if (chars[j] != chars[pos]) {
					success = false;
					break;
				}
			}
			if (success) {  //记录位置
				maxLength = posRec - i;
				left = i;
				right = posRec;
			}
			num = posRec - 1;
		}
		return s.substring(left, right + 1);
    }
}
