/*
 * 编写一个函数，其作用是将输入的字符串反转过来。

示例 1:

输入: "hello"
输出: "olleh"
示例 2:

输入: "A man, a plan, a canal: Panama"
输出: "amanaP :lanac a ,nalp a ,nam A"
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
