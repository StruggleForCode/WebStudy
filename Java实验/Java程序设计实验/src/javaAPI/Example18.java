package javaAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example18 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		
		System.out.println("�����Զ�����ַ�����ʽ��ʽ����ǰ����");
		
		String str = sdf.format(d);
		System.out.println("��" + d + "ת����������ʱ�������ʽ");
		System.out.println(str);
		System.out.println("-------------------");
		
		String s = "2016-12-12 23:12:34";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");
		System.out.println("�����Զ�����ַ����ĸ�ʽ��s������Date��ʽ");

		Date dd = sdf2.parse(s);
		System.out.println("���ַ���" + s + "������Date��ʽ");
		System.out.println(dd);
	}
}
