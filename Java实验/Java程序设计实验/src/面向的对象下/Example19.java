package ����Ķ�����;

public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divide(4, 0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣�� " + e.getMessage());
		}
	}
	
	public static int divide(int x, int y) throws MyException{
		if (y == 0) {
			throw new MyException("����Ϊ����");
		}
		return x / y;
	}

}

class MyException extends Exception{

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

