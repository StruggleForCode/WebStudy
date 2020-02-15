package example02;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IndexServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		//0.���ñ��룬��ֹ����
		response.setContentType("text/html;charset=utf-8");
		//1.��ȡ�����û���Ϣ��session����
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		//2.�ж��û��Ƿ��½�������½����ʾ��ӭ��Ϣ��������ʾδ��½��Ϣ
		
		if(user == null){
			response.getWriter().println("����û�е�½����<a href ='/p05012/login.html' >��½</a>");
		}else{
			response.getWriter().println("���ѵ�¼����ӭ����" + user.getUsername() + "!");
			response.getWriter().println("<a href = '/p05012/logoutServlet'>�˳�</a>");
		}
		
		//3.����cookie���session�ı�ʶ��
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(60*30);
		cookie.setPath("/p05012");
		response.addCookie(cookie);
	}
}
