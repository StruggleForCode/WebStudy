package ����Ķ�����;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
			System.out.println("�������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("���쳣��");
		}finally {
			System.out.println("�ͷ���Դ");
		}
	}

}
