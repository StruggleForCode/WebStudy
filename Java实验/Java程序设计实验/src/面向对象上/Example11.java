package ���������;

public class Example11 {
	
	static {
		System.out.println("��̬�����");
	}
	
	{     //�������飬 ����һ������ִ��һ�Σ� ���ڹ��캯��ִ��    
		System.out.println("��������");
	}
	
	public Example11() {
		System.out.println("���췽��");
	}
	
	public void localBlock() {
		System.out.println("����һ������");
		{
			System.out.println("�ֲ������");
		}
	}
	
	
	public static void main(String[] args) {
		Example11 e1 = new Example11();
		Example11 e2 = new Example11();
		
		e1.localBlock();
		e2.localBlock();
		
	}
}
