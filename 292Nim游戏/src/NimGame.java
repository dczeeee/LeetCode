/*
 * ���������ѣ�������һ���� Nim��Ϸ����������һ��ʯͷ��ÿ�����������õ� 1 - 3 ��ʯͷ�� �õ����һ��ʯͷ���˾��ǻ�ʤ�ߡ�����Ϊ���֡�

�����Ǵ����ˣ�ÿһ���������Ž⡣ ��дһ�����������ж����Ƿ�����ڸ���ʯͷ�����������Ӯ����Ϸ��

ʾ��:

����: 4
���: false 
����: ��������� 4 ��ʯͷ����ô����Զ����Ӯ�ñ�����
     ��Ϊ���������� 1 �顢2 �� ���� 3 ��ʯͷ�����һ��ʯͷ���ǻᱻ����������ߡ�
 */
public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(canWinNim(n));
	}
	public static boolean canWinNim(int n) {
		return (n % 4 != 0);
    }
}
