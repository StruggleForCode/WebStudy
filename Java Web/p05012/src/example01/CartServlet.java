package example01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ��ʾ���ﳵ������
 * @author 27289
 *
 */

public class CartServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡsession �����ж��û��Ƿ��Ѿ�����ͼ��
		//���û�й�����ʾû�й���

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//����cart�����û��Ĺ��ﳵ
		List<Book> cart = null;
		//����purFlag����û��Ƿ������Ʒ
		boolean purFlag = true;
		//����û���session
		HttpSession session = request.getSession(false); //����false,���лỰ���򷵻أ����򷵻�null������Ϊtrue,���лỰ�򷵻أ������½�һ���Ự
		//���sessionΪnull, purFlag��Ϊfalse
		if(session == null){
			purFlag = false;
		}
		else{
			//����û����ﳵ
			cart = (List) session.getAttribute("cart");
			//����õĹ��ﳵΪnull, purFlag ��Ϊfalse;
			if(cart == null){
				purFlag = false;
			}
		}
		// ���purFlag Ϊfalse, �����û�û�й���ͼ�飬�ض���ListServletҳ��
		if(!purFlag){
			out.write("�Բ�������û�й����κ���Ʒ");
		}else{
			out.write("�������ͼ���У�<br/>");
			double price = 0;
			for (Book book: cart){
				out.write(book.getName() + "<br/>");
			}
		}
	}

}
