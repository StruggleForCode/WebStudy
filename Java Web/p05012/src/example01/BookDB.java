package example01;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
	
	private static Map<String, Book> books = new LinkedHashMap<String, Book>();
	static{
		books.put("1", new Book("1", "javaweb ����"));
		books.put("2", new Book("2", "jdbc ����"));
		books.put("3", new Book("3", "java����"));
		books.put("4", new Book("4", "struts����"));
		books.put("5", new Book("5", "spring����"));
	}
	
	//������е�ͼ��
	public static Collection<Book> getAll(){
		return books.values();
	}
	
	//����ָ����id���ͼ��
	public static Book getBook(String id){
		return books.get(id);
	}
	
	public static void main(String args[]){
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("cn", "CHIAN");
		map.put("jp", "JAPAN");
		map.put("us", "UNITED STATES");
		
		String value = map.get("cn");
		System.out.println(value);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		System.out.println(map.entrySet());
	}

}
