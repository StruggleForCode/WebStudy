package javaAPI;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HelloWorld";
		//��ȡ����
		System.out.println(s.length());
		//��ȡ�������ַ�
		System.out.println(s.charAt(3));
		//��ȡ��һ�γ��֡�I'���±�
		System.out.println(s.indexOf('I'));
		//���ַ���s������ַ���ʼ�������ַ�'I'������
		System.out.println(s.indexOf('l', 4));
		//�ַ���s�е�5���ַ�����β��ɵ����ַ���
		System.out.println(s.substring(4));
		//�ַ���s�е�5������9���ַ���ɵ��´���
		System.out.println(s.substring(4, 8));	
	}

}
