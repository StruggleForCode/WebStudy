package package_collection;

import java.util.ArrayList;

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		//ctrl alt + xia  ����
		list.add(new Student("��ǿ", 36));
		list.add(new Student("����", 33));
		list.add(new Student("����", 42));
		list.add(new Student("����", 35));
		for(int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.getName() + " " + stu.getAge());
		}
		
		//3.�жϼ������Ƿ��б�ǿ
		boolean bl = list.contains(new Student("��ǿ", 36));
		System.out.println(bl);
	
	
		
		//4.������תΪ����
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			Student  stu =  (Student) list.get(i);
			System.out.println(stu.getName() + "--------" + stu.getAge());
			stu.toString();
		}
		
	}

}
