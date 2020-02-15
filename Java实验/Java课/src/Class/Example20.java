package Class;

public class Example20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		try {
//			int result = divide(4,0);
//		}catch(Exception e) {
//			System.out.println("������쳣��Ϣ�� " + e.getMessage());
//			System.exit(0);    // ���� finally �е����ݲ�ִ��
//			return;
//		}finally {
//			System.out.println("Hello world");
//		}
//		System.out.println("�������ִ��");
		
		
		try {
			int result = divide(4, 0);
		} catch (DivideByMinusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

//	private static int divide(int x, int y) throws Exception {	//  throws �÷��������д��� 
//		return x /y;											//�����޸ģ� ������޸ı��벻��ͨ��
//	}
	
	private static int divide (int x, int y) throws DivideByMinusException{
		if(y <= 0) {
			throw new DivideByMinusException("����Ϊ����");   // throw�ؼ��������ڷ����������׳��쳣��ʵ������
		}
		return x / y;
	}

}


class DivideByMinusException extends Exception{

	public DivideByMinusException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DivideByMinusException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

