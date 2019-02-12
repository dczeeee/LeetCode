/*
 * ������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��

�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����

ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��

ע�⣬һ��ʼ����ͷû���κ���Ǯ��

������ܸ�ÿλ�˿���ȷ���㣬���� true �����򷵻� false ��

ʾ�� 1��

���룺[5,5,5,10,20]
�����true
���ͣ�
ǰ 3 λ�˿�������ǰ�˳����ȡ 3 �� 5 ��Ԫ�ĳ�Ʊ��
�� 4 λ�˿����������ȡһ�� 10 ��Ԫ�ĳ�Ʊ�������� 5 ��Ԫ��
�� 5 λ�˿���������һ�һ�� 10 ��Ԫ�ĳ�Ʊ��һ�� 5 ��Ԫ�ĳ�Ʊ��
�������пͻ����õ�����ȷ�����㣬����������� true��
ʾ�� 2��

���룺[5,5,10]
�����true
ʾ�� 3��

���룺[10,10]
�����false
ʾ�� 4��

���룺[5,5,10,10,20]
�����false
���ͣ�
ǰ 2 λ�˿�������ǰ�˳����ȡ 2 �� 5 ��Ԫ�ĳ�Ʊ��
���ڽ������� 2 λ�˿ͣ�������ȡһ�� 10 ��Ԫ�ĳ�Ʊ��Ȼ�󷵻� 5 ��Ԫ��
�������һλ�˿ͣ������޷��˻� 15 ��Ԫ����Ϊ��������ֻ������ 10 ��Ԫ�ĳ�Ʊ��
���ڲ���ÿλ�˿Ͷ��õ�����ȷ�����㣬���Դ��� false��
 

��ʾ��

0 <= bills.length <= 10000
bills[i] ���� 5 ���� 10 ���� 20 
 */
public class LemonadeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = {5,5,10,10,20};
		System.out.println(lemonadeChange(bills));
	}

	public static boolean lemonadeChange(int[] bills) {
		if(bills[0] != 5) {
			return false;
		}
        int five = 0;
        int ten = 0;
        for(int i = 0;i < bills.length;++i) {
        	if(bills[i] == 5) {
        		++five;
        	}
        	else if(bills[i] == 10) {
        		if(five == 0) {
        			return false;
        		}
        		--five;
        		++ten;
        	}
        	else {
	            if(five > 0 && ten > 0) {
	                --five;
	                --ten;
	            }
	            else if (five >= 3) {
	                five -= 3;
	            } 
	            else {
	                return false;
	            }
        	}
        }
        return true;
	}
}
