package javaAPI;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PI��ֵ��" + Math.PI);
		System.out.println("��Ȼ�����ĵ����� " + Math.E );
		System.out.println("3�ľ���ֵ " + Math.abs(3));
		System.out.println("27�������� " + Math.cbrt(27));
		System.out.println("16��ƽ���� " + Math.sqrt(16));
		System.out.println("4��ƽ���� " + Math.pow(4,  2));
		System.out.println("12.345ʹ��ceil������Ľ���ǣ�" + Math.ceil(12.345));
		System.out.println("-12.234ʹ��floor������Ľ���ǣ� " + Math.floor(-12.345));
		for (int i = 0; i < 3; i++) {
			System.out.println(Math.random());
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((int)(Math.random() * 100 + 1));  // �߽�ֵ1-100
		}

	}

}
