package javaAPI;

import java.util.Arrays;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = {5, 6, 7, 8, 9};
		System.out.println("ϵͳ��ǰʱ�䣺" + System.currentTimeMillis());
		System.arraycopy(arr, 3, arr2, 3, 2);
		
		System.out.println("����arr������Ϊ��" + Arrays.toString(arr));
		System.out.println("����arr2������Ϊ��" + Arrays.toString(arr2));
		System.exit(100);
		System.out.println("HelloWorld");
	}

}
