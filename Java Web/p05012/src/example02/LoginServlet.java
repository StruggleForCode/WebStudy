package example02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		//0.���ñ��룬��ֹ����
		response.setContentType("text/html;charset=utf-8");
		//1.��ȡ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		//2.�ж��û����������Ƿ���ȷ�������ȷת����ҳ���棬��������û�������������Ϣ.������ȷ���û�����������:imust 123
		if("imust".equals(username) && ("123").equals(password)){
			//�½��û����󣬰��û��������session
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			request.getSession().setAttribute("user",user);
			//ת����ҳ��
			response.sendRedirect("/p05012/indexServlet");
		}else{
			pw.write("�û�������������½ʧ�ܣ�");
		}
		
	}
}
