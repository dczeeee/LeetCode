/*
 * ����һ��Excel����е������ƣ���������Ӧ������š�

���磬

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
ʾ�� 1:

����: "A"
���: 1
ʾ�� 2:

����: "AB"
���: 28
ʾ�� 3:

����: "ZY"
���: 701
 */
public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ZY";
		System.out.println(titleToNumber(s));
	}

	public static int titleToNumber(String s) {
		int res = 0;
		int len = s.length();
        for(int i = 0;i < len; ++i) {
        	res += Math.pow(26, len-i-1)*(s.charAt(i)-'A'+1);
        }
        return res;
    }
}
