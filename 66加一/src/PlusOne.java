/*
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��

���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

����Լ���������� 0 ֮�⣬��������������㿪ͷ��

ʾ�� 1:

����: [1,2,3]
���: [1,2,4]
����: ���������ʾ���� 123��
ʾ�� 2:

����: [4,3,2,1]
���: [4,3,2,2]
����: ���������ʾ���� 4321��
 */
public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9};
		System.out.println(plusOne(digits));
	}
	public static int[] plusOne(int[] digits) {
		int len = digits.length, i = len-1, th = 9;
        digits[i] += 1;
        if (digits[i] > th){
            while(i > 0 && digits[i] > th){
                digits[i] = 0;
                digits[--i] += 1;
            }
            if (i == 0 && digits[i] > th){
                digits = new int[len+1];
                digits[0] = 1;
            }
        }
        return digits;
    }
}
