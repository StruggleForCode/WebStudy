package javaAPI;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hellowrld";
		
		System.out.println(s.replace('l', 'p'));
		System.out.println(s.replace("ll", "ak47"));
		String ages = "20-30";
		String[] s1 = ages.split("-");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		
		//ȥ����β�ո����ַ���
		String name = "  admin hello      ";
		System.out.println(name.trim());
		
		String s2 = "hello";
		String s3 = "aello";
		//���ֵ��˳��Ƚ��ַ���
		System.out.println(s2.compareTo(s3));
	}

}
