package javaAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String date1 = "2014-5-31";
		
		DateFormat df1 = DateFormat.getDateInstance();
		
		Date d1 = null;
		try {
			d1 = df1.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����" + date1 + "��ת����Date���͵Ľ���ǣ� ");
		System.out.println(d1);
		
		//ͨ��DateFormat�ľ�̬����getDateTimeInstance()������ȡDateFormatʵ������
		DateFormat  df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		Date d2 = new  Date();
		
		//��Date����ת�����ַ�����ʽ
		String s = df2.format(d2);
		System.out.println("����" + d2 + "��ת����������ʱ�������ʽ�ǣ�");
		System.out.println(s);
	}

}
