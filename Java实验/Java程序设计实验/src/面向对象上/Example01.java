package ���������;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("����", 19);
		s1.Speak();
		Student s2 = new Student("����", 20);
		s2.Speak();
		Student s3 = s2;
		s3.Speak();
	}

}
