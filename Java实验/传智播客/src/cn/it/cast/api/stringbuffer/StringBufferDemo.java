package cn.it.cast.api.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * StringBuffer
		 * 1.是一个字符串缓冲区， 其实就是一个容器
		 * 2.长度是可变的， 任意类型都行   // 注意： 是将任意数据都转成字符串进行存储
		 * 3.容器对象提供了很多对容器数据的操作功能， 比如： 添加， 删除， 插入，查找， 修改
		 * 4.必须和所有的数据最终编程一个字符串
		 * 和数组最大的不同就是：数组存储可以单独操作每一个元素， 每一个元素都是独立的。
		 * 字符串缓冲区， 多有存储的元素都被转成字符串，而且最后拼成了一个大的字符串
		 * 
		 * 
		 */
		
		
		//1。 创建一个字符串缓冲区， 用于存储数据
		StringBuffer sb = new StringBuffer();
		
		//2.添加数据   。   不断的添加数据之后， 要对缓冲区的最后的数据进行操作， 必须转成字符串才可以
		sb.append(true).append("hehe");
		sb.append("abc");
		
		sb.insert(2, "it");
		
		sb.delete(1, 4 );
		
		System.out.println(sb);

	}

}
