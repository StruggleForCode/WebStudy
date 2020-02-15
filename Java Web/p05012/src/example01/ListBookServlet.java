package example01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �г���վ�ṩ������ͼ��
 * @author 27289
 *
 */

public class ListBookServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		//���ñ��룬��ֹ����
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//�г����е�ͼ��
		Collection<Book> books = BookDB.getAll();
		out.write("��վ�ṩ��ͼ���У�<br />");
		for(Book book : books){
			String url = "purchaseServlet?id=" + book.getId();
			out.write(book.getName() + "<a href = '" + url + "'>�������</a><br />");
		}
	}
}
