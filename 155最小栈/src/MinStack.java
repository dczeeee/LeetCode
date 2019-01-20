import java.util.Stack;

/*
 * ���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��

push(x) -- ��Ԫ�� x ����ջ�С�
pop() -- ɾ��ջ����Ԫ�ء�
top() -- ��ȡջ��Ԫ�ء�
getMin() -- ����ջ�е���СԪ�ء�
ʾ��:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> ���� -3.
minStack.pop();
minStack.top();      --> ���� 0.
minStack.getMin();   --> ���� -2.
 */
public class MinStack {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MinStack() {
        
    }
    
    public void push(int x) {
        if(minStack.isEmpty() || x < minStack.peek()) {
        	minStack.push(x);
        }
        else {
        	minStack.push(minStack.peek());
        }
        stack.push(x);
    }
    
    public void pop() {
    	minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
