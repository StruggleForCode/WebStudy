package ���������;

public class Example14 {

	void test() {
		int num = 5;
		class Inner{
			void show() {
				System.out.println("�ֲ�����"  + num);
			}
		}
		
		Inner inner = new Inner();
		inner.show();
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example14 a = new Example14();
		a.test();
		
	}

}
