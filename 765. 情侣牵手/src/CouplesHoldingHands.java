/*
 * N �����������������е� 2N ����λ�ϣ���Ҫǣ���Է����֡� �������ٽ�����λ�Ĵ������Ա�ÿ�����¿��Բ�������һ�� һ�ν�����ѡ���������ˣ�������վ����������λ��

�˺���λ�� 0 �� 2N-1 ��������ʾ�������ǰ�˳���ţ���һ���� (0, 1)���ڶ����� (2, 3)���Դ����ƣ����һ���� (2N-2, 2N-1)��

��Щ���µĳ�ʼ��λ  row[i] �������ʼ���ڵ� i ����λ�ϵ��˾����ġ�

ʾ�� 1:

����: row = [0, 2, 1, 3]
���: 1
����: ����ֻ��Ҫ����row[1]��row[2]��λ�ü��ɡ�
ʾ�� 2:

����: row = [3, 2, 0, 1]
���: 0
����: ���轻����λ�����е����¶��Ѿ�������ǣ���ˡ�
˵��:

len(row) ��ż������ֵ�� [4, 60]��Χ�ڡ�
���Ա�֤row ������ 0...len(row)-1 ��һ��ȫ���С�
 */
public class CouplesHoldingHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] row = {0,1,2,3};
		System.out.println(minSwapsCouples(row));
	}

	public static int minSwapsCouples(int[] row) {
        int res = 0;
        for(int i = 0;i < row.length;i += 2) {
        	if(couple(row[i]) != row[i+1]) {
        		for(int j = i+2;j < row.length;++j) {
        			if(row[j] == couple(row[i+1])) {
        				swap(row, i, j);
        				res++;
        			}
        		}
        	}
        }
        return res;
    }
	
	private static int couple(int i) {
		return i%2 == 0 ? i+1 :i-1;//ż����һ��������һ
	}
	
	private static void swap(int[] row, int i, int j) {
		int temp = row[i];
		row[i] = row[j];
		row[j] =temp;
	}
}
