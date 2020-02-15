package example01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * �û�������������빺�ﳵ
 * @author 27289
 *
 */

public class PurchaseServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//1.����ͼ�����Ϣ���浽session������
		String id = request.getParameter("id");
		if(id == null){
			//���idΪnull, �ض���ListBookServletҳ��
			String url = "listBookServlet";
			response.sendRedirect(url);
			return;
		}
		Book book = BookDB.getBook(id);
		//�������߻���û���Session����
		HttpSession session =  request.getSession();
		//��Session�����л���û��Ĺ��ﳵ
		List<Book> cart = (List) session.getAttribute("cart");
		if(cart == null){//���ﳵΪ�գ���һ�η���
			//�״ι���Ϊ�û�����һ�����ﳵ��List����ģ�⹺�ﳵ��
			cart = new ArrayList<Book>();
			//�����ﳵ����Session����
			session.setAttribute("cart", cart);
		}
		//����Ʒ���빺�ﳵ
		cart.add(book);
		//����Cookie���Session�ı�ʶ��
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(60*30);
		cookie.setPath("/p05012");
		response.addCookie(cookie);
		//�ض��򵽹��ﳵҳ��
		String url = "cartServlet";
		response.sendRedirect(url);
	}
}
