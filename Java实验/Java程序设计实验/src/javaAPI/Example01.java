package javaAPI;

public class Example01 {
	
	public static void main(String[] agrs) {
		String s1 = new String();
		s1 = "abcde";
		System.out.println("ͨ��String()�����������ַ���s1:" + s1);
		
		byte[] bys = {97, 98, 99, 100, 101};
		String s2 = new String(bys);
		System.out.println("ͨ��String{byte[] bytes}�����������ַ���s2:" + s2);
		
		String s3 = new String(bys, 2, 3);
		System.out.println("ͨ��String{byte[] bytes, int index, int length}�����������ַ���s3:" + s3);
		
		char[] chs = {'a', 'b', 'c', 'd', 'e'};
		String s4 = new String(chs);
		System.out.println("ͨ��String{char[] value}�����������ַ���s4:" + s4);
		
		String s5 = new String(chs, 1, 3);
		System.out.println("ͨ��String{char[] value, int index, int length} �����������ַ���s5:" + s5);
		
		String s6 = new String("abcde");
		System.out.println("ͨ��String(String str)�����������ַ���s6:" + s6);
		
		String s7 = "abcde";
		System.out.println("ֱ�Ӹ��ַ�������ֵs7:" + s7);
	}

}
