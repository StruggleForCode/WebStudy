package package_linkedlist;

import java.util.LinkedList;

public class TestDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("����");
		list.add("�׾�");
		list.add("���");
		
		list.addFirst("ǿ��");
		System.out.println(list);
		
		list.addLast("����");
		System.out.println(list);

	}

}
