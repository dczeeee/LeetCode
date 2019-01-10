import java.util.Stack;

/*
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����

ʾ�� 1:

����: "()"
���: true
ʾ�� 2:

����: "()[]{}"
���: true
ʾ�� 3:

����: "(]"
���: false
ʾ�� 4:

����: "([)]"
���: false
ʾ�� 5:

����: "{[]}"
���: true
 */
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()]";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < s.length();i++) {
    	if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
    		st.push(s.charAt(i));
    	}
		if(s.charAt(i) == ')') {
			if(!st.empty()&&st.peek() == '(')
				st.pop();
			else
				st.push(s.charAt(i));
		}
    	if(s.charAt(i) == ']') {
    		if(!st.empty()&&st.peek() == '[')
    			st.pop();
    		else
    			st.push(s.charAt(i));
    	}
    	if(s.charAt(i) == '}') {
    		if(!st.empty()&&st.peek() == '{') 
    			st.pop();
    		else
    			st.push(s.charAt(i));
    	}
    	}
        if(st.empty())
        	return true;
        return false;
    }
}
