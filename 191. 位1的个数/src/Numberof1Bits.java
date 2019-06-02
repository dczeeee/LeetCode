
public class Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 56;
		System.out.println(hammingWeight(n));
	}

	public static int hammingWeight(int n) {
        int result = 0;
        while(n!=0) {
        	result ++;
        	n &= (n-1);
        }
        return result;
    }
}
