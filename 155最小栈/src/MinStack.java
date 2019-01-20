import java.util.Stack;

/*
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
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
