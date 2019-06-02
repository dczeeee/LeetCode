
public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(43261596));
	}

	public static int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while(count < 32) {
        	res <<= 1;
        	res += n&1;
        	n >>= 1;
        	count ++;
        }
        return res;
    }
}
