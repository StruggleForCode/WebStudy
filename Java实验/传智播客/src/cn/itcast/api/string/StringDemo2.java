package cn.itcast.api.string;

public class StringDemo2 {
	public static void main(String[] args) {
		/**
		 * "abcde"
		 * 
		 * 1.�ַ�����һ������ ��ô���ķ�����Ȼ��Χ�Ʋ��������������ݶ������
		 * 2.����Ϊ�ַ������Ժ���Щ������
		 * 	2.1�ж���ַ��أ�
		 * 	int length()	
		 * 
		 * 	2.2�ַ���λ��
		 *    int indextOf(char, fromIndex)
		 * 
		 *  2.3��ȡ����λ���ϵ��ַ�
		 *  char charAt(int)
		 *  
		 *  
		 *  2.4��ȡ�����ַ���
		 *	String substring(int start, int end); 
		 */
		String str = "abad";
		int len = str.length();
		System.out.println(len);
		
		//-----a��ĸ���ֵ�λ��----------
		
		int index = str.indexOf('a');    // ��ȡ�ַ����ֵĵ�һ��λ��
		System.out.println("index = " + index);
		
		
		//-----�ڶ���a��ĸ���ֵ�λ��----------
		int index1 = str.indexOf('a', index + 1);
		System.out.println(index1);
		
		
		int index3 = str.lastIndexOf('a');    // ���Ҫ�ҵ��ַ������� -1
		System.out.println(index3);
		
		
		//-------��ȡ����λ���ϵ��ַ�----
		String str1 = "itcast";
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		//-------��ȡ�����ַ���-----
		String s = str1.substring(2, 4);	//����ͷ����������β
		System.out.println(s);
		
	}
}
