package ����Ķ�����;

public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int result = div(4, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣");
		}
		
	}
	
	private static int div(int a, int b) throws Exception {
		return a / b;
	}
}
