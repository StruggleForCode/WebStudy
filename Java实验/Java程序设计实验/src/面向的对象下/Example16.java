package ����Ķ�����;

public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 1, 2, 3, 3};
		
		try {
			for (int i = 0; i < 7; i++)
				System.out.println(arr[i]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�Ǳ�Խ�� : " + e.getMessage());
		}
		
		System.out.println("over");
		
	}
}
