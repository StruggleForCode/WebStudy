package ���߳�2;

//�����ͻ���һ������ȥ��Ǯ��ÿ���ͻ�һ�δ�100�� ��3��
//���⣺�ĳ����Ƿ��а�ȫ���⣬ ����У� д���������̣� ������������
/**
* 
* @author 27289
*
*/
/*
*�������н��
sum = 200
sum = 200
sum = 400
sum = 300
sum = 600
sum = 500

��ӡ���ң� �����ģ� ���Ƿ�����ֵ���� û��100
���м��η����жԵġ�
sum = 100
sum = 100
sum = 200
sum = 400
sum = 300
sum = 500

˵�����̵߳����������˰�ȫ����ķ���

�ǵ����⣿
1. ��Ȼʱ���̵߳����⣬ �������ⷢ�����߳������ڡ�
2.����������Ƿ��й��������أ� �еģ�   b������е�sum
3.�Ƿ��ж�sum���ж�������أ���

��ͬ���͸㶨�ˡ�



*/


class Bank{
	private int sum;
	private Object obj = new Object();
	public void add(int num) {
		synchronized (obj) {
			sum += num;
			System.out.println("sum = "+ Thread.currentThread().getName()+"......" + sum);
		}
	}
}

class Consumer implements Runnable{
	private Bank b = new Bank();
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			b.add(100); //һ�δ�100  ѭ��3��
		}
		
	}
}


public class TreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer c = new Consumer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
