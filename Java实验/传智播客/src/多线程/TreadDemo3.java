package ���߳�;


class Ticket implements Runnable{
	//1.����Ʊ������
	private static int tickets = 100;
	
	private Object obj = new Object();
	
	boolean flag = true;
	
	//2.��Ʊ�Ķ����� ���������Ҫ�����߳�ִ�У� �Ǿ����߳�������룬��Ҫ����run�����С�
	//�߳�������ͨ������ѭ���ṹ
	public void run() {
		if (flag) {
			while(true) {
				synchronized(Ticket.class){
					if (tickets > 0) {
					
						//Ҫ���߳���������ͣ��ģ������ķ��� sleep  ������0 - 1- 2 ��������ݣ� ������Ǵ�˵�еĶ��̰߳�ȫ���⡣
						try{Thread.sleep(10);}catch(InterruptedException e){/*δд�����쳣*/}
					
						System.out.println(Thread.currentThread().getName()+ ".....obj��������" + tickets--);
					}
				}
			}
		}
		else {
			while(true) {
				Ticket.sale();
				}
				
			}
	}
	
	
	public static synchronized void sale() {			//ͬ������

		if (tickets > 0) {
			
			//Ҫ���߳���������ͣ��ģ������ķ��� sleep  ������0 - 1- 2 ��������ݣ� ������Ǵ�˵�еĶ��̰߳�ȫ���⡣
			try{Thread.sleep(10);}catch(InterruptedException e){/*δд�����쳣*/}
		
			System.out.println(Thread.currentThread().getName()+ ".....sale��������" + tickets--);
		}
	}
	
}



public class TreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.����Runnable�ӿڵ��������
		Ticket t = new Ticket();
		
		//2.�����ĸ��̶߳��󣬲���Runnable�ӿڵ����������Ϊ��������Thread�Ĺ��캯��
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
//		Thread t3 = new Thread(t);
//		Thread t4 = new Thread(t);
		
		
		//3.�����ĸ��߳�
		t1.start();
		
		try {Thread.sleep(10);}catch(InterruptedException e) {}
		
		//�л����֮ǰ�� �����߳�ͣһ�ᣬ ���Ǿ�ֻ��һ��t1�߳��Ӱ�ȥ�� ���ͻ�ִ��ͬ������顣
		t.flag = false;
		
		
		t2.start();
//		t3.start();
//		t4.start();
		
		
	}

}
