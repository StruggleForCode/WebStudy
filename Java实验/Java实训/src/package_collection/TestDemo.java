package package_collection;

import java.util.ArrayList;

/*
 * ���������ϵĲ������������
 */

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1����һ������
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("����");
		list1.add("����");
		list1.add("��");
		list1.add("�Ѿ�");
		
		//2:�ڶ�������
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("��ѩ");
		list2.add("����");
		list2.add("��");
		list2.add("�Ѿ�");
		
		//3�����������ϵĲ���
		//list1.addAll(list2);//list1 �д洢��Դlist1,list2�����ݺϼ�
		//System.out.println(list1);
		
		//4:���������ϵĽ���
//		list1.retainAll(list2);
//		System.out.println(list1);
		
		//5.���������ϵĲ
		list1.removeAll(list2);
		System.out.println(list1);
		
		
	}

}
