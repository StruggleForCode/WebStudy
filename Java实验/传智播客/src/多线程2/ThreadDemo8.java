
package ���߳�2;


/*
 * ����1.
 * ���н�������ݴ��� �Ѿ������������ڵ���Ʒ�� �ű����ѵ�
 * �������̰߳���ȫ���⣬ ��ͬ������� ʹ��ͬ������
 * �����ѽ���� ���������ѵ�֮ǰ�����ڵ���Ʒ
 * 
 * ����2
 * ��������������ȴû�����ѣ� ͬʱ��ͬһ����Ʒ���ж������
 * ϣ���Ľ��Ӧ��������һ����Ʒ�� �ͱ����ѵ�
 * 
 * ������������⣿
 * ������ʲôʱ�������� ������ʲôʱ�����ѣ�
 * ��������û�����ʱ�� �������� ������������ �Ͳ�����
 * �������������ʱ�� �����ѣ� ���û������� �Ͳ�����
 * 
 * 
 * ��������������Ʒ����ø��������������ѣ� ���ǵ�������Ӧ���ڵȴ�״̬
 * ��������������Ʒ�� Ӧ���������ߣ� ���������ߴ��ڵȴ�״̬
 * 
 * �ȴ��� wait()
 * ���� : notify();//����
 * 
 * �������� ʵ��������һ������һ��
 * 
 * 
 * 
 */

//������Դ�����ԣ���Ʒ���ƺͱ�ţ� ��Ϊ������Ʒ���Ƹ�ֵ����ȡ��Ʒ
class Resource {
	private String name;
	private int count = 1;
	
	//������
	private boolean flag = false;
	
	//1.�ṩ���÷���
	public synchronized  void set(String name){
		if (flag)
			try {wait();}catch(InterruptedException e) {}
		
		//����Ա������ֵ�����ϱ��
		this.name = name + count;
		
		//��ӡ�����Ǹ���Ʒ
		System.out.println(Thread.currentThread().getName() + ".....������...." + this.name);
		
		//�������
		count++;
		
		flag = true;
		notify();
	}
	public synchronized void out() {
		if (!flag)
			try {wait();}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ".....������...." + this.name);
		
		//����Ǹ�Ϊfalse
		flag = false;
		notify();
	}

}

class Producer implements Runnable{
	private Resource r = new Resource();
	Producer(Resource r){
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set("���");
		}
	}
}


class CONSUMER implements Runnable{
	Resource r = new Resource();
	CONSUMER(Resource r){
		this.r = r;
	}
	public void run() {
		while (true) {
			r.out();
		}
	}
}

public class ThreadDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new Resource();
		
		Producer pro = new Producer(r);
		CONSUMER con = new CONSUMER(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		t1.start();
		t2.start();
	}

}
