/*
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串。

示例:

输入: "Hello World"
输出: 5
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
