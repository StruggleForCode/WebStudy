package package_API;

import java.awt.List;
import java.util.ArrayList;

/*
 * ���飺������
 * 	1.�����ǹ̶���
 * 	2.ֻ�ܴ�ͬһ���͵�����
 * 	3.������˳��洢
 * ���ϣ�������
 * ArrayList  LinkeList    HashSet  LinkedHashSet   TreeSet 	HashMap LinkedHashMap TreeMap
  * ����			����	 	     ��ϣ��	   ��ϣ��+����			������	��ϣ��	��ϣ��+����			������
 * 
 * 
 */

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world ");
		ArrayList<String> list1 = new ArrayList<String>();
		//Ԫ����ӵ�˳������ݵ�˳��һ��
		list1.add("����");
		list1.add("����");
		list1.add("�׾�");
		list1.add("ǿ��");
		System.out.println(list1);
		list1.remove("ǿ��");
		System.out.println(list1);
//		list1.clear();
//		System.out.println(list1);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}
