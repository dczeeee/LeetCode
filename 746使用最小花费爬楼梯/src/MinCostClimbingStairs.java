/*
 * �����ÿ��������Ϊһ�����ݣ��� i�����ݶ�Ӧ��һ���Ǹ�������������ֵ cost[i](������0��ʼ)��

ÿ��������һ�������㶼Ҫ���Ѷ�Ӧ����������ֵ��Ȼ�������ѡ�������һ�����ݻ������������ݡ�

����Ҫ�ҵ��ﵽ¥�㶥������ͻ��ѡ��ڿ�ʼʱ�������ѡ�������Ϊ 0 �� 1 ��Ԫ����Ϊ��ʼ���ݡ�

ʾ�� 1:

����: cost = [10, 15, 20]
���: 15
����: ��ͻ����Ǵ�cost[1]��ʼ��Ȼ�����������ɵ����ݶ���һ������15��
 ʾ�� 2:

����: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
���: 6
����: ��ͻ��ѷ�ʽ�Ǵ�cost[0]��ʼ�����������Щ1������cost[3]��һ������6��
ע�⣺

cost �ĳ��Ƚ����� [2, 1000]��
ÿһ�� cost[i] ������һ��Integer���ͣ���ΧΪ [0, 999]��
 */
public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {10, 15, 20};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
		int allCost = 0;
		int a = 0;
		int b = 0;
	    for(int i = 0;i<cost.length-1;i++){
	        if(cost[i]+a > cost[i+1]+b)
	            allCost = cost[i+1]+b;
	        else
	            allCost = cost[i]+a;
	        a = b;
	        b = allCost;
	        
	    }
	    return allCost;
    }
}
