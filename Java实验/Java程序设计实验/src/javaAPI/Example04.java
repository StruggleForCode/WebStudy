package javaAPI;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "HelloWorld";
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " ");
		}
		
		char[] chs2 = {'a', 'b', 'c', '��', '��'};
		//ͨ��String���copyValueof()�������ַ�����chs2ת���ַ���
		System.out.println(String.copyValueOf(chs2));
		//ͨ��String���valueOf()�������ַ�����chs2ת�����ַ���
		System.out.println(String.valueOf(chs2));
		
		
		//ͨ��String���valueOf()������int ����100ת�����ַ���
		int i = 100;
		System.out.println(String.valueOf(i));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//�ַ���sƴ�ӡ�world'�� ���ɵ����ַ���
		System.out.println(s.concat("world"));
	}
}
