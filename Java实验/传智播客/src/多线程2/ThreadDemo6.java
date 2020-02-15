package ���߳�2;

//����ʽ	 ���̲߳���û����
class Single{
	private static final Single s = new Single();
	
	private Single() {}
	
	public static Single getInstance() {
		return s;
	}
}


//����ʽ
class Single1{
	private static Single1 s = null;
	
	private Single1() {}
	/*
	 * �������ʻ��а�ȫ���� �� ���Լ���ͬ�����ƽ������ȫ����
	 * ���ǣ�ͬ���ĳ��ֽ���Ч��
	 * ����ͨ��˫���жϵķ�ʽ�����Ч�����⣬ �����ж����Ĵ�
	 */
	private static Single1 getInstance() {
		if (s == null) {
			synchronized (Single1.class) {
				if (s == null) {
					s = new Single1();
				}
			}
		}
		return s;
	}
}

class Demo implements Runnable{
	public void run() {
		
	}
}

public class ThreadDemo6 {
	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
